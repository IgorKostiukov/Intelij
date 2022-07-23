package com.syntax.class29;

import java.util.HashMap;

public class Hw4 {
    public static void main(String[] args) {
        HashMap<Integer,String> building=new HashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Ajax");
        building.put(4,"Slack");
        building.put(1,"Sony");
        building.put(5,"Google");
        building.put(7,"Syntax");
        System.out.println(building.size());
        building.put(4,"Nvidia");
        building.remove(7);
        System.out.println(building);
    }
}
