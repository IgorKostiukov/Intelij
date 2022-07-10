package com.syntax.HW;

public class MarksTest {
    public static void main(String[] args) {


        StudentA mark = new StudentA();
        StudentB mark1 = new StudentB();
        System.out.println(mark.getAverage(10,20,30));
        System.out.println(mark1.getAverage(20,40,50,60));
    }
}
