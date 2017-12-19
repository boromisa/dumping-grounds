package com.mycompany.app;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FileReader {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://umod-dev2api-int.gutcheckit.com:5432/constellation";

    //  Database credentials
    static final String USER = "constellation";
    static final String PASS = "s7WHTW7WtI2z";
    static PreparedStatement preparedStatement = null;

    public static void main(String args[]) throws ClassNotFoundException {

        String fileName = "/tmp/random.csv";
        Connection conn = null;
        Class.forName(JDBC_DRIVER);

        //STEP 3: Open a connection
        System.out.println("Connecting to database... and processing file " + fileName);

        String insertTableSQL = "INSERT INTO versium_random"
            + " (email, md5, timestamp, ip, site, url, referer, useragent) VALUES(?,?,?,?,?,?,?,?)";
      //      + " (CSQueryType, CSInput, CSTableName, EmailAddrMD5Lower, EmailAddr, TimeStamp, IP, URLDomain, URLPage, URLQuery, Referrer, UAID, UserAgent, SearchTerms) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        FileInputStream fstream = null;
        //read file into stream, try-with-resources
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            preparedStatement = conn.prepareStatement(insertTableSQL);
            fstream = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String line;
            int count = 1;
            while ((line = br.readLine()) != null) {
                workLoop(line, preparedStatement);
                System.out.println(count++);
            }
            preparedStatement.executeBatch();
        }
        catch (Exception e) {

            e.printStackTrace();
        }
        finally {

            try {
                fstream.close();

                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            }
            catch (Exception se2) {
            }// nothing we can do
            try {
                if (conn != null) {
                    conn.close();
                }
            }
            catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try

    }


    public static void workLoop(String line, PreparedStatement preparedStatement) {

        try {
           // String[] items = line.split(",", -1);
            String[] items = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
            int counter = 1;

            for (String item : items) {
                if(item.length() > 4500)
                  item = item.substring(0, 4499);

                preparedStatement.setString(counter, item);
                counter++;

            }

            preparedStatement.addBatch();
        }
        catch (Exception e) {

        }
    }
}