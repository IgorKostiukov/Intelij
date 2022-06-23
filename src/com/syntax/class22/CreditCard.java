package com.syntax.class22;

public class CreditCard {
    int balance=2000;
    double interest;
    double rate=0.0083;
    double calc(){


interest=rate*balance;
return interest;
    }
}
class Visa extends CreditCard{

}
class AX extends  CreditCard{
    double calc(){
        //Override
        interest=rate*balance*2;
        return interest;
    }
}
class Test1{
    public static void main(String[] args) {
        CreditCard m1=new CreditCard();
        Visa m2=new Visa();
        AX m3=new AX();
        System.out.println( m1.calc());
        System.out.println( m2.calc());
        System.out.println( m3.calc());
    }
}