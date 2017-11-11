package com.mycompany.app;

import java.util.Comparator;
import java.util.TreeSet;

public class TestCase{
        
    public static void main(String[] args){
        TreeSet<Rock> set = new TreeSet<Rock>(new Comparator<Rock>(){
                public int compare(Rock a, Rock b){
                    return a.value - b.value;
                }
            }
        );
        
        set.add(new Rock(1,"one"));
        set.add(new Rock(2,"two"));
        set.add(new Rock(2,"other two"));
        
        for(Rock r: set)
            System.out.println(r.name);
    }

}

class Rock{
    int value;
    String name;
    Rock(int v, String s){
        value = v;
        name = s;
    }
    
}