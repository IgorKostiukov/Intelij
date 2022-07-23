package com.syntax.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums=new ArrayList<>(new LinkedHashSet<>(nums)); //1-st way
        System.out.println(nums);
        //2-d way
        /*LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>(); //creating Setr
        linkedHashSet.addAll(nums);// addAll to Set
        nums=new ArrayList<>();// create new array
        nums.addAll(linkedHashSet);// adding uniq elements */

    }
}
