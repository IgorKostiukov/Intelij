package com.syntax.class31;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileReadindDemo {
    public static void main(String[] args) throws IOException {
        String path="Files/DemoFile.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet= xssfWorkbook.getSheet("sheet1");
        int noOfRows=sheet.getPhysicalNumberOfRows();
        for (int i=0;i<noOfRows;i++){
            Row row = sheet.getRow(i);
            int noOfCells=row.getPhysicalNumberOfCells();
            for (int j=0;j<noOfCells;j++){
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println("");
        }
        fileInputStream.close();

    }
}
