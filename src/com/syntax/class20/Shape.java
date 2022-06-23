package com.syntax.class20;

public class Shape {
    int raidus;
    double area;

    Shape(int radius) {
        this.raidus=radius;


    }
   public  double area(){
        area=Math.PI*Math.pow(raidus,2);
        return area;
    }
}
