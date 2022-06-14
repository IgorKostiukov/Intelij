package com.syntax.class15;

public class Task3 {
    void pali(String a) {
        StringBuilder str=new StringBuilder(a);


        str.reverse();
        String rev=str.toString();
        if(a.equalsIgnoreCase(rev)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not a palindrom");
        }


    }

    public static void main(String[] args) {
        Task3 md=new Task3();
        md.pali("rAcecar");
    }
}
