package com.syntax.class30;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileHandleDemo {
    public static void main(String[] args) throws IOException {
        String path="Files/Trump.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.setProperty("Funny","true");
        properties.store(fileOutputStream,"A new property was added");

    }
}
