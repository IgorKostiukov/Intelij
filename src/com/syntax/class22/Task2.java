package com.syntax.class22;

public class Task2 {
    private void name(){
        System.out.println("simple");

    }
    private void name(int age,String name){
        System.out.println(name+age);
    }
    private void name(String name,int age,String msg){
        System.out.println(name+" "+age+" "+msg);
    }

    public static void main(String[] args) {
        Task2 m1=new Task2();
        m1.name(26,"Hos");
        m1.name("lol",25,"Etto da");
        m1.name();
    }
}
