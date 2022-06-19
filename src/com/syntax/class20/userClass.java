package com.syntax.class20;

public class userClass {
    String name;
    String number;
    userClass(String name, String number){
        this.name=name;
        this.number=number;
    }
    void printf(){
        System.out.print(name+" "+number);
    }
}
