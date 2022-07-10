package com.syntax.class26;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList <Integer> oddNum= new ArrayList<>();
        for(int i=0;i <=10;i++){
            if (i%2 == 1) {
            oddNum.add(i);
        }}
        System.out.println(oddNum);
        System.out.println(oddNum.get(2));
        ArrayList <String> arr= new ArrayList<>();
        arr.add("git");
        arr.add("Java");
        arr.add("SDLC");
        System.out.println(arr.indexOf("Java"));
        System.out.println(arr);
        arr.remove(1);
        // arr.remove("Java");
        System.out.println(arr);
    }

}
