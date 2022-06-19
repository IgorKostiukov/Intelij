package com.syntax.class17;

public class Student {
    private String name;
    private String address;
    Student(String name,String address){
        this.name=name;
        this.address=address;
        displayInfo();
          }

    private void displayInfo() {

        System.out.println(name);
        System.out.println(address);
    }
}
