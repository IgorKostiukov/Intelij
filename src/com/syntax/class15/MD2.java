package com.syntax.class15;

public class MD2 {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        ArrayUtils array=new ArrayUtils();
        array.printArray(arr);
        int sum=array.summary(arr);
        System.out.println(sum);
    }
}
