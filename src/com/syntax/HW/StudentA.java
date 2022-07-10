package com.syntax.HW;

class StudentA extends Marks  {

    @Override
    public double getAverage(double a, double b, double c, double d) {
        return 0;
    }

    @Override
    public double getAverage(double a, double b, double c) {
        double avg= (a+b+c)/3;
        return avg;
    }
}
