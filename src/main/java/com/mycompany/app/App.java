package com.mycompany.app;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 * 
 */
public class App {
    public static void main(String[] args) {

        Map<Integer, Munnas> dtoYo = new HashMap<Integer, Munnas>();

        dtoYo.put(1, new Munnas(1, "one record"));
        dtoYo.put(2, new Munnas(2, "two record"));
        dtoYo.put(4, new Munnas(4, "four record update!"));
        dtoYo.put(3, new Munnas(3, "three record"));
        dtoYo.put(5, new Munnas(5, "new record"));

        Map<Integer, Munnas> sourceYo = new HashMap<Integer, Munnas>();

        sourceYo.put(1, new Munnas(1, "one record"));
        sourceYo.put(2, new Munnas(2, "two record"));
        sourceYo.put(3, new Munnas(3, "three record"));
        sourceYo.put(4, new Munnas(4, "four record"));

        // means we are adding!
        if (dtoYo.size() > sourceYo.size()) {
            System.out.println("we are about to add a record");
            for (Munnas m : dtoYo.values()) {
                Munnas munnis = null;
                if (sourceYo.containsKey(m.value)) {
                    munnis = dtoYo.get(m.value);
                    sourceYo.put(munnis.value, munnis);
                }
                else {
                    System.out.println("not found, so it is being added!");
                    sourceYo.put(m.value, m);
                }
            }

        }// means we are deleting!
        else if (dtoYo.size() < sourceYo.size()) {

            System.out.println("we are about to delete a record");
            for (Munnas m : sourceYo.values()) {
                // if its there map the values over.
                if (dtoYo.containsKey(m.value)) {
                    Munnas munnis = dtoYo.get(m.value);
                    sourceYo.put(munnis.value, munnis);
                }
                else {
                    System.out.println("not found, so it is being added!");
                    sourceYo.remove(m.value);
                }
            }

        }// Straight map.
        else if (dtoYo.size() == sourceYo.size()) {
            for (Munnas m : sourceYo.values()) {
                // if its there map the values over.
                Munnas munnis = dtoYo.get(m.value);
                sourceYo.put(munnis.value, munnis);
            }
        }

        System.out.println("printing source to see what is in it!");
        for (Munnas m : sourceYo.values()) {
            System.out.println(m);
        }

    }
}

class Munnas {
    int value;
    String name;

    Munnas(int v, String s) {
        value = v;
        name = s;
    }

    @Override
    public String toString() {
        return "Munnas [value=" + value + ", name=" + name + "]";
    }

}