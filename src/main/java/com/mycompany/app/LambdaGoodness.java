package com.mycompany.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class LambdaGoodness {

    public static void main(String[] args) {


 Locale locale = new Locale(null);

        String hey = "key.income.answer.level.1";

        hey = new StringBuilder(hey).insert(hey.lastIndexOf("."), ".low").toString();

        System.out.println(hey);


        // TODO Auto-generated method stub
        List<Integer> intList = new ArrayList();
        System.out.println("kuk");
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        
        
       // Object[] transactionsIds = intList.stream().filter(t -> t >= 5).toArray();

//        System.out.println(transactionsIds[0]);
//        System.out.println(transactionsIds.length);

        List<String> heyNow = new ArrayList();

        heyNow.add("B");
        heyNow.add("C");
        heyNow.add("D");
        heyNow.add("A");

        for(String fool : heyNow) {
            System.out.println(fool);
        }

        Collections.sort(heyNow);
        System.out.println("kuken \n\n");

        for(String yo : heyNow) {
            System.out.println(yo);
        }

    }


}
