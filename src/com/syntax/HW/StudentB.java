package com.syntax.HW;

public class StudentB extends Marks {

   @Override
    public double getAverage(double a, double b, double c, double d) {
        double avg= (a+b+c+d)/4;
        return avg;
    }

    @Override
    public double getAverage(double a, double b, double c) {
        return 0;
    }

}
