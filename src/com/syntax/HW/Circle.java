package com.syntax.HW;

public class Circle implements Shape{

    @Override
    public void calculateArea() {
        System.out.println(Math.PI*Math.pow(r,2));
    }

    @Override
    public void calculatePerimetr() {
        System.out.println(2*Math.PI*r);
    }
}
