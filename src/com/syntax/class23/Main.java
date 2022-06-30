package com.syntax.class23;

public class Main {
    public static void main(String[] args) {
        Student [] s1 ={new Student(),new CollegeStudent(),new SchoolStudent()};
        for(Student i:s1) {
            i.rests();
            i.studies();
        }
    }
}
