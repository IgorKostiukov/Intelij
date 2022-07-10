package com.syntax.HW;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        if(email.contains("@yahoo.com")) {
            return email;
        } else {
            email="Email is invalid, try registering with yahoo email";
            return email;
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        if(userName =="" || userName.length()<6){
            userName="Cannot be empty or less than 6 characters long";
            return userName;
        } else {
            return userName;
        }
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        if(password =="" || password.length()<6 || password.equals(userName)){
            password="Cannot be empty or less than 6 characters long";
            return password;
        } else {
            return password;
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        Registration reg=new Registration();
        reg.setEmail("asdasd@google.com");
        reg.setPassword("1231515");
        reg.setUserName("Igor");

        System.out.println( reg.getPassword());
        System.out.println(reg.getUserName());
        System.out.println(reg.getEmail());
    }
}
