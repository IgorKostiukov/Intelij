package com.syntax.HW;

public class Truck implements Vehicle{
    double weight=3000;

    @Override
    public double calculateSalePrice() {
        double price=0;
        if (weight>2000) {
            price=vechilePrice- (vechilePrice*0.1);
            return price;
        } else {
            price =vechilePrice-(vechilePrice*0.2);
            return price;
        }
    }
}
