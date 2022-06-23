package com.syntax.class22;

public class AdvancedCalc {
   static void printNames(String ... names){ //Var args - variable arguments
        for (String i:names){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printNames("Igor","Aladin");
        int age=10;
        String name;
       /* if(age>18){
            name="Time to go work";
        } else {
            name="Enjoy no work";
        }
        System.out.println(name);*/
        String name2=age>18?"Time to work":"Enjoy no work";
        System.out.println(name2);
    }
}
