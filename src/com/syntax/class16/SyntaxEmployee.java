package com.syntax.class16;

public class SyntaxEmployee {
    int emplID;
    int salary;
   static String CEO="Sumair";
    public static void main(String[] args) {
        
SyntaxEmployee firststEmpl=new SyntaxEmployee();
SyntaxEmployee secondEmpl=new SyntaxEmployee();
firststEmpl.emplID=134;
firststEmpl.salary=50;
secondEmpl.emplID=135;
secondEmpl.salary=60;
        System.out.println("ID= "+firststEmpl.emplID+ " Salary= "+firststEmpl.salary +" Ceo is "+CEO);
        System.out.println("ID= "+secondEmpl.emplID+ " Salary= "+secondEmpl.salary+" Ceo is "+CEO);
    }

}
