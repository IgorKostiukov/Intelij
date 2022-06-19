package com.syntax.class20;
import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,3,2,4,1,3};
arr=removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));


    }

    static int[] removeDuplicates(int[] arr) {
        int[] newArr = new int[arr.length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    newArr[i] = arr[i];
                    counter++;
                }
            }
        }
        int[] arr2 = new int[arr.length - counter];
        int counter2=0;
        int counter3=0;
        for (int i:arr){
            if(!isPresent(i,newArr)){
                arr2[counter2++]=i;
                    counter3++;
            }
        }
        int [] arr3=Arrays.copyOf(arr2,counter3);
        return arr3;
    }

   static boolean isPresent(int element, int[] arr) {
        for (int e : arr) {
            if (element == e) {
                return true;
            }


        }
        return false;

    }
    static boolean isZero(int element, int[] arr) {
        for (int e : arr) {
            if (element == e) {
                return true;
            }


        }
        return false;

    }
}

