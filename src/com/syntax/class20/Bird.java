package com.syntax.class20;

public class Bird {
    String name;
    int age;
    Bird(String name,int age){
        this.name=name;
        this.age=age;

    }
    void printf(){
        System.out.println(name+" "+age);
    }
}
class Parrot extends Bird{
    Parrot (String name,int age){
    super(name,age);
}}
