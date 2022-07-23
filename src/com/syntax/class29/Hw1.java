package com.syntax.class29;

import java.util.ArrayList;
import java.util.List;

public class Hw1 {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        List<String> newList= new ArrayList<>();
        for( String i:aList){
            if(!newList.contains(i)){
                newList.add(i);
            }
        }
        System.out.println(newList);
    }
}
