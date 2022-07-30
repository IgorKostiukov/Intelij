package com.syntax.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static  Properties read (String path)  {
        Properties properties=new Properties();
        FileInputStream fileInputStream=null;
        try{
            fileInputStream=new FileInputStream(path);

            properties.load(fileInputStream);
        } catch (IOException io){
            System.out.println("Pleaswe check the file at this path, if it is present = "+path);
        } finally {
            if(fileInputStream!=null) {
                try {
                    fileInputStream.close();
                }catch (IOException ioException){
                    System.out.println("Error while closeing the file");
                }
            }
        }
        return properties;
    }
}
