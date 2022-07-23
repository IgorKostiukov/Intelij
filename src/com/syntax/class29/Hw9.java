package com.syntax.class29;

import java.util.ArrayList;

public class Hw9 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        int sumn=0;
        for(Integer i:list){
            sumn+=i;
        }
        System.out.println(sumn);
    }

}
