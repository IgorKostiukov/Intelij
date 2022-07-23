package com.syntax.class29;

import java.util.*;

public class Hw5 {
    public static void main(String[] args) {
        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("Ukraine","Kiev");
        countries.put("Poland","Warshav");
        countries.put("England","London");
        Collection<Map.Entry<String,String>> count=countries.entrySet();
        for (Map.Entry<String,String> i:count){
            System.out.println(i+" ");
        }
        Iterator <String> iterator=countries.values().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
