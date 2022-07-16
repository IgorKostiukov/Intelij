package com.syntax.class27;

import java.util.ArrayList;

public class Hw1 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("Igor");
        list.add("Oleg");
        list.add("Elexia");
        list.add("Asghar");
        list.add("Kat");
        System.out.println(list);
        if (list.contains("Kat")){
            System.out.println("Kat is present in the list");
        }
        System.out.println("Size of arraylist is "+list.size()+"  "+list);
    }
}
