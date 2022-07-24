package com.syntax.class30;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class task1 {
    public static void main(String[] args) throws IOException {
        String path="Files/task1.properties";
        Properties properties=new Properties();
        FileInputStream fileInputStream= new FileInputStream(path);
        properties.load(fileInputStream);
        System.out.println(properties.get("url"));

    }
}
