package com.syntax.class15;

public class Task5 {
    boolean isPrime(int x){
        boolean isPrime=true;
        if(x>1) {

            for(int i=2;i<x;i++) {
                if(x%i==0) {  // if the number that user has provided if that number is completely divisable by any other number
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Task5 md=new Task5();
        System.out.println(md.isPrime(5));
    }
}
