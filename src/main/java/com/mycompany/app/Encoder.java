package com.mycompany.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Encoder {


    public static void main(String[] args) throws IOException {

        String myMegaString = null;
        BufferedReader reader = new BufferedReader(new FileReader("/Users/daniel/Documents/personality-IBM-watson/raw-text-23261.txt"));
        String line;
        while ((line = reader.readLine()) != null)
        {
            myMegaString = new StringBuilder().append(myMegaString).append(line).toString();
        }
        reader.close();

        String encodedEmail = URLEncoder.encode(myMegaString, StandardCharsets.UTF_8.toString());

    }

}
