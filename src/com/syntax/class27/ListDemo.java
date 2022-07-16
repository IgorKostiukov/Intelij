package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> legends = new ArrayList<>();
        legends.add("Hamid");
        legends.add("Tara");
        legends.add("Bahram");
        System.out.println(legends.isEmpty());
        System.out.println(legends.contains("Burham"));
        Object[] arr = legends.toArray();
        System.out.println(arr[0]);
        List<String > students=new ArrayList<>();
        students.add("Yusuf");
        students.add("George");
        List<String> stud=new ArrayList<>();
        System.out.println(legends.containsAll(students));
        stud.addAll(students);
        stud.addAll(legends);
        System.out.println(stud.get(4));

        System.out.println(stud);
        stud.set(0,"Alladin");
        System.out.println(stud.subList(0,3));
        stud.removeAll(legends);
        System.out.println(stud);
        stud.clear();
        System.out.println(stud);
    }
}