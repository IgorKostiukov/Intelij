package com.syntax.class20;

public class Shape {
    int raidus;
    double area;

    Shape(int radius) {
        this.raidus=radius;


    }
   public  double area(){
        area=3.14*(this.raidus^2);
        return area;
    }
}
