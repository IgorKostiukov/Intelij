package com.syntax.class29;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private double salary;
    Person (String name,String lastName, int age, double salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;

    }
    void details(){
        System.out.println("Name :"+name+" Last Name "+lastName+" Age "+age+" Salary: "+salary);
    }

}
