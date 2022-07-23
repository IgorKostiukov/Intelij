package com.syntax.class29;

import java.util.*;

public class Hw7 {
    public static void main(String[] args) {
        HashMap<String,Double> emplyee= new HashMap<>();
        emplyee.put("Ivan",22.5);
        emplyee.put("Nancy",100.4);
        emplyee.put("John",35.2);
        Map.Entry<String, Double>
 biggest= Collections.max(emplyee.entrySet(),(Map.Entry<String,Double>e1, Map.Entry<String,Double>e2)->e1.getValue().compareTo(e2.getValue()));



        System.out.println(biggest);

    }
}
