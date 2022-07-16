package com.syntax.class27;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> names=new LinkedList<>();

        names.add("Tara");
        names.add("Oleg");
        names.add("Asghar");
        names.add("Zameer");
        System.out.println(names.size());
    }
}
