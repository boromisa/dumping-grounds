package com.mycompany.app.puzzlers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Highfrequency {

    public static void main(String[] args) {
        HashMap<String, Integer> highFrequency = highFrequency("hey now you fool I think you are the master fool fool me once cant fool me twice");
        highFrequency.forEach((k,v) -> System.out.println("Key " + k + " : " + v ));
    }

    private static HashMap<String, Integer> highFrequency(String input) {
        HashMap<String, Integer> highFrequency = new HashMap<String, Integer>();
        String[] split = input.split(" ");
        Arrays.stream(split).forEach(x -> addWord(x, highFrequency));
        return highFrequency;
    }

    private static void addWord(String word, HashMap<String, Integer> frequency) {
        if(frequency.containsKey(word)) {
            frequency.replace(word, frequency.get(word),frequency.get(word) + 1);
        }
        else
        {
            frequency.put(word, 1);
        }

    }
}
