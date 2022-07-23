package com.syntax.class29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;

public class ConfigFileDemoi {
    public static void main(String[] args) throws IOException {
        String path = "Files/Config.properties";
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(path);
        properties.load(fileInputStream);
        System.out.println(properties.get("URL"));
        //  Collection<Object> keys=properties.values();
        //  for(Object j:keys) {
        //System.out.println(j);
        //  }
        fileInputStream.close();
    }

}
