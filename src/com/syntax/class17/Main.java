package com.syntax.class17;

public class Main {
    static String mixString(String s1,String s2){
        String c="";
        String d="";
        for(int i=0;i<s1.length();i++){
            c+=s1.charAt(i);
            d+=c+s2.charAt(i);
            c="";
        }
        return d;
    }

    //test case below (dont change):
    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");

        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);

    }
}
