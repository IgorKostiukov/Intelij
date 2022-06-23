package com.syntax.class22;

public class Task1 {
    void print(){
        System.out.println("i love programming languages");
    }
    void print(String a){
        System.out.println("i love "+a);
    }

    public static void main(String[] args) {
        Task1 ob1=new Task1();
        ob1.print("Java");
    }
}
