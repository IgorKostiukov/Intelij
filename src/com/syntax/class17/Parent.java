package com.syntax.class17;

public class Parent {
    String name="Misha";
    double money=1000000;

}
class Child extends Parent{
    void printInfo(){
        System.out.println("My fullname is "+name);
    }
    void buyCar(){
        System.out.println("Buying Car from Mama's money "+money);
    }

    }

class Tester {
    public static void main(String[] args) {
        Child m1 = new Child();
        m1.printInfo();
        m1.buyCar();
    }
}
