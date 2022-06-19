package com.syntax.class20;

public class userDetails extends userInfo{
    userDetails(String name, String number,String userAddress){
        super(name,number,userAddress);
    }
    public static void main(String[] args) {
        userDetails details=new userDetails("olol","8502131245","Miramar street");
        details.printf();
    }
}
