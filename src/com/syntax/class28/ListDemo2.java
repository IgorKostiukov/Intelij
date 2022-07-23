package com.syntax.class28;

import java.util.ArrayList;

public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<Flower> flowers= new ArrayList<>();
        flowers.add(new Rose());
        flowers.add(new Lilly());
        flowers.add((new Flower()));
        for (Flower obj:flowers){
            obj.bloom();

        }

    }
}

class Flower {
    void bloom(){
        System.out.println("Generally flower bloom in Spring");
    }
}

class Lilly extends Flower{
    void bloom(){
        System.out.println("bloom in April");
    }
}
class Rose extends Flower{
    void bloom(){
        System.out.println("Bloom in May");
    }
}