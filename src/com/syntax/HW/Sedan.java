package com.syntax.HW;

public class Sedan implements Vehicle{
    int length=30;

    @Override
    public double calculateSalePrice() {
        double price=0;
        if(length>20) {
            price=vechilePrice-(vechilePrice*0.05);
            return price;
        } else {
            price=vechilePrice-(vechilePrice*0.1);
            return price;
        }
    }
}
