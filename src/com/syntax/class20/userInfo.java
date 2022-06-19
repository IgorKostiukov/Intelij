package com.syntax.class20;

public class userInfo extends userClass{
    String userAddress;
    userInfo(String name,String number,String userAddress){
        super(name,number);
        this.userAddress=userAddress;

    }
    void printf(){
        super.printf();
        System.out.print(" "+userAddress);
    }

}
