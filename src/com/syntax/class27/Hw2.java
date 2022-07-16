package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class Hw2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("BMW");
        list.add("Lexus");
        list.add("Mazda");
        for(int i=0;i< list.size();i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list);
      Object [] list1=list.toArray();
      for(int i=0;i< list1.length;i++) {
          System.out.print(list1[i]+" ");
      }
        System.out.println();
      List<String> word=new ArrayList<>();
      word.add("Hi");
      word.add("Bye");
      word.add("Alloe");
      word.add("Lie");
      word.add("integere");
      word.add("asa");
        System.out.println(word);
        List<String> word1=new ArrayList<>();
       for (int i=0;i<word.size();i++){
           if(!word.get(i).endsWith("e")){
               word1.add(word.get(i));
           }
       }
        System.out.println(word1);

    }
}
