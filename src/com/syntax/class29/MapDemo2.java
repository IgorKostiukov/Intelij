package com.syntax.class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        TreeMap<String,Integer> fruits=new TreeMap<>();
        fruits.put("Apple",2000);
        fruits.put("Orange",424);
        fruits.put("Kiwi",11);
        fruits.put("Banana",532);
        TreeMap<String,Integer> Cosmetics= new TreeMap<>();
        Cosmetics.put("foundation",20);
        Cosmetics.put("lipstiock",42);
        Cosmetics.put("mascara",115);
        Cosmetics.put("blush",53);
        LinkedHashMap<String,Integer> groceries = new LinkedHashMap<>();
        groceries.putAll(Cosmetics);
        groceries.putAll(fruits);
        System.out.println(groceries);
    }
}
