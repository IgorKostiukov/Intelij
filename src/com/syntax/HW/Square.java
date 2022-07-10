package com.syntax.HW;

public class Square implements Shape{
    @Override
    public void calculateArea() {
        System.out.println(Math.pow(a,2));
    }

    @Override
    public void calculatePerimetr() {
        System.out.println((l+w)*2);
    }
}
