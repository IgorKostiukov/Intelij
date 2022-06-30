package com.syntax.class18;


    public class Book {
        String name;
        int pages;
        Book(String name){
            this.name=name;
            System.out.println("Shows only name "+name);
        }
       private Book(String name,int pages){
            this.name=name;
            this.pages=pages;
            System.out.println("Show name and pages "+name+" "+pages);
           System.out.println();
        }
    }


