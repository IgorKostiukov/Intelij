package com.syntax.class31;

import com.syntax.utils.Constants;
import com.syntax.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class excellReaderDemo {
    public static void main(String[] args) throws IOException {
        List<Map<String,String>> excelData = ExcelReader.read(Constants.ExcelFilePath);
    Map<String,String> firstRow= excelData.get(1);
        System.out.println(firstRow.get("First name"));
        for (Map<String,String> row :excelData
             ) {
            for (Map.Entry<String,String> entry:row.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            System.out.println("***************");
        }
    }
}
