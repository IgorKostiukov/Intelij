package com.syntax.class20;

public class aaaaaa {

        public static String alphabetical(String str){
            String str2=String.valueOf(str.charAt(0));
            char  max= str.charAt ( 0 );
            for (int i=1;i<str.length();i++){
            if(max<str.charAt(i)){
                str2+=String.valueOf(str.charAt(i));
                max=str.charAt(i);
            }

            }
            return str2;
        }
        public static void main(String[] args){
            aaaaaa m1=new aaaaaa();
            System.out.println(m1.alphabetical("hello"));
            System.out.println(m1.alphabetical("software"));
            System.out.println(m1.alphabetical("language"));
        }

    }

