package com.syntax.class29;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit= new HashMap<>();
        fruit.put("Apple",2000.0);
        fruit.put("Orange",424.5);
        fruit.put("Kiwi",11.12);
        fruit.put("Banana",532.54);
        System.out.println(fruit);
        System.out.println(fruit.get("Kiwi"));
        fruit.remove("Orange");
        System.out.println(fruit);
        System.out.println(fruit.containsValue(11.12));
        System.out.println(fruit.containsKey("Apple"));
        System.out.println(fruit.isEmpty());
        fruit.replace("Kiwi",15.2);
        System.out.println(fruit);
        fruit.put(null,null);
        System.out.println(fruit);
    }
}
