package com.syntax.class33;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        names.add("JAson");
        names.add("Ozkan");
        names.add("Asghar");
        names.add("Tara");
        System.out.println(names);;
        names.forEach(System.out::println);
        names.forEach(name-> System.out.println(name.length()));
        names.removeIf(name->name.contains("k"));
        System.out.println(names);
    }
}
