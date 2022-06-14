package com.syntax.class15;

public class Task4 {
    String address(String a,String b,String c){
        String email = a+b+"@"+c+".com";
        return email;
    }

    public static void main(String[] args) {
        Task4 md=new Task4();
        System.out.println(md.address("Asghar","Instructor","gmail"));
    }
}
