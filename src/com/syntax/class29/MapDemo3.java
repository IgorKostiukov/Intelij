package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 2000.0);
        fruit.put("Orange", 424.5);
        fruit.put("Kiwi", 11.12);
        fruit.put("Banana", 532.54);
        Set<String> key = fruit.keySet(); //all the keys
        for (String s : key) {
            System.out.println(s);
        }
        Collection<Double> arr=fruit.values(); // all the values
        System.out.println(arr);
        Set< Map.Entry<String,Double>> entries =fruit.entrySet();
        for(Map.Entry<String,Double> j:entries){
            System.out.println(j);
        }
        fruit.forEach((keys,value)-> System.out.println(keys+value)); //lambda expression
    }
}
