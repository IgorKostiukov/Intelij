package com.syntax.class27;

import java.util.ArrayList;

public class Hw4 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        for(int i=1;i<=500;i++){
            list.add(i);
        }
        int count=1;
        for (int i=1;i<=500;i++){
            if(i%5==0){
               list.remove(i-count);
               count++;
            }
        }

        System.out.println(list);
    }
}
