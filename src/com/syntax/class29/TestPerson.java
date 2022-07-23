package com.syntax.class29;

import java.util.TreeMap;

public class TestPerson  extends Person{

    TestPerson(String name, String lastName, int age, double salary) {
        super(name, lastName, age, salary);
    }

    public static void main(String[] args) {
        Person pers=new Person("Igor","Kostiukov",22,23);
        Person person1=new Person("Igor12","Kostiukov12",222,233);
        Person person2=new Person("Ig","Kostov",22345,23.2);

        System.out.println();
        TreeMap<Integer,Person> person=new TreeMap<>();
        person.put(1,pers);
        person.put(2,person1);
        person.put(3,person2);
        for(Person t:person.values())
        {
            t.details();
        }

        }
    }

