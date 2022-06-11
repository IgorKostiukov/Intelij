package com.syntax.class15;

public class ArrayUtils {
    void printArray(int [] arr){
        for(int i:arr){
            System.out.println(i);
        }

        }
    int summary (int [] sum){
        int a=0;
        for (int i:sum) {

            a+=i;

        }
        return a;
    }



}
