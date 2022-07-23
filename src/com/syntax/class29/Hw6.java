package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hw6 {
    public static void main(String[] args) {
        HashMap<Integer,String> bestBuy= new HashMap<>();
        bestBuy.put(7664847,"Printer");
        bestBuy.put(7879885,"Tv");
        bestBuy.put(2131234,"Ps5");
        Collection<Map.Entry<Integer,String>> product=bestBuy.entrySet();
        System.out.println(product);
    }
}
