package com.syntax.class28;

import java.util.HashMap;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> groceries=new HashMap<>();
        groceries.put("Banana",5);
        groceries.put("Eggs",3);
        groceries.put("Mleko",12);
        groceries.put("Fish",22);

        Set<String> key=groceries.keySet();
        for (String s:key) {
            System.out.println(s);
        }
    }
}
