package com.syntax.class17;

public class Book {
    String name;
    int pages;
    Book(String name){
        this.name=name;
        System.out.println("Shows only name "+name);
    }
    Book(String name,int pages){
        this.name=name;
        this.pages=pages;
        System.out.println("Show name and pages "+name+" "+pages);
    }
}
