package com.syntax.class28;

import java.util.LinkedList;

class Main {
    static int i = 2;
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<>();
        for(int j=2;j<100;j++){
            if(isPrime(j)){
                list.add(j);
            }

        }
        System.out.println(list);
    }
}