package com.syntax.class20;

public class circle extends Shape{
    circle(int radius){
        super(radius);
    }
    public static void main(String[] args) {
        Shape shape=new Shape(5);
        System.out.println(shape.area());
    }
}
