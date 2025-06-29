package org.basicProgram1;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;


public class ReadAllStringData {
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("./src/test/resources/ExcelFiles/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet s = wb.getSheet("String");
            int totalRowNum = s.getLastRowNum();
            System.out.println("Total No Of rows = " +totalRowNum);
            for(int i=0;i<=totalRowNum;i++)
            {
                Row r=s.getRow(i);
                int totalCellCount = r.getLastCellNum();
                for(int j=0;j<totalCellCount;j++)
                {
                    Cell c=r.getCell(j);
                    String value = c.getStringCellValue();
                    System.out.println(value);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        
    }
}
