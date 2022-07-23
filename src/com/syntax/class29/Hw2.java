package com.syntax.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Hw2 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("New York");
        cities.add("Apalachakola");
        cities.add("Panama city");
        cities.add("Alibas");
         cities.removeIf( cit->cit.startsWith("A"));
        System.out.println(cities);

    }
}
