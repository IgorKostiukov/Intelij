package com.syntax.class31;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelFileReadAndStoreDemo {
    public static void main(String[] args) throws IOException {
        String path="Files/DemoFile.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet= xssfWorkbook.getSheet("sheet1");
        int noOfRows=sheet.getPhysicalNumberOfRows();
        List<Map<String,String>> excelData = new ArrayList<>();
        HashMap<String,String> rowData;
        Row headerRow = sheet.getRow(0); // all keys in a map
        for (int i=1;i<noOfRows;i++){
            Row dataRow = sheet.getRow(i);
            rowData= new HashMap<>();
            int noOfCells=dataRow.getPhysicalNumberOfCells();
            for (int j=0;j<noOfCells;j++){
                rowData.put(headerRow.getCell(j).toString(),dataRow.getCell(j).toString());
            }

            excelData.add(rowData);
        }
        for(Map<String,String > i :excelData) {
            System.out.println(i);
        }
        fileInputStream.close();

    }
}
