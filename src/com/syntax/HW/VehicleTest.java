package com.syntax.HW;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle [] vehicle = {new Sedan(),new Truck()};
        for( Vehicle vehicles:vehicle){
            System.out.println(vehicles.calculateSalePrice());
        }
    }
}
