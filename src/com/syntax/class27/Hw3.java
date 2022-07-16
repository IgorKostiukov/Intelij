package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class Hw3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Coke");
        list.add("Fanta");
        list.add("Sprite");

        for(int i=0;i< list.size();i++) {
            if (list.get(i).contains("a") || list.get(i).contains("e")) {
list.set(i,"Water");
            }
        }
        System.out.println(list);
    }
}
