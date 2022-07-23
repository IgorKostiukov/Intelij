package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class Hw3 {
    public static void main(String[] args) {
        HashMap<String,Integer> students=new HashMap<>();
        students.put("Igor",22);
        students.put("Oleg",12);
        students.put("Azzadin",32);
        Collection<String> names=students.keySet();
        for (String i:names) {
            System.out.println(i + " ");
        }
    }
}
