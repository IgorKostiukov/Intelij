package com.syntax.class20;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
    static private String maxLength(String[] arr){
        int count=0;
        int comp=0;
        String str=arr[0];
        String str2="";
        for(int i=0;i<arr.length;i++){

            str2=arr[i];
            if(str.length()<str2.length()) {
                str=str2;
            }

        }
        return str;
    }
}