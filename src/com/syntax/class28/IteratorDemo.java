package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hope");
        words.add("Play");
        words.add("Come");
        words.add("Frame");
        words.add("game");
        words.removeIf(nat ->nat.endsWith("e"));
        System.out.println(words);
      /*  for(String word:words){
            if(word.endsWith("e")){
                words.remove(word);
            }
        }
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).endsWith("e")) {
                words.remove(i);
            }*/
        Iterator<String> iterator =words.iterator();
     //   System.out.println(iterator.hasNext());
    //    System.out.println(iterator.next());
      //  System.out.println(iterator.next());
     /*   while (iterator.hasNext()){
            System.out.println(iterator.next());
            if(iterator.next().endsWith("e")){
                words.remove(iterator.next());
        }
        }*/

    }}
