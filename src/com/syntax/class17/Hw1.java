package com.syntax.class17;

public class Hw1 {
    private int sum;
    private static String str;
    private int summary(int [] sum){
        for(int i=0;i<sum.length;i++){
            this.sum+=sum[i];
        }
        return this.sum;
    }
    public static String reverse(String rev){
        StringBuilder str= new StringBuilder(rev);
        str.reverse();
        String str2=str.toString();
        return str2;
    }
    private static String vow(String a){
            str=a.replaceAll("[^aeiouAEIOU]","");
        return str;
    }

    public static void main(String[] args) {
        Hw1 m1=new Hw1();
        System.out.println(reverse("lolka"));
        int [] a={1,2,3,5,6};
        System.out.println(m1.summary(a));
        System.out.println(vow("aieppppp"));
    }
}
