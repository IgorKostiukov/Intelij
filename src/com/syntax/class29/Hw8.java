package com.syntax.class29;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Hw8 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Abrad");
        list.add("Kadabra");
        list.add("Shakazam");
        String concat="";
        for(String s:list){
            concat+=s;
        }
        System.out.println(concat);
    }
}
