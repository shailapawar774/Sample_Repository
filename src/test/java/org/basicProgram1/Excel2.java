package org.basicProgram1;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;


public class Excel2 {
    public static void main(String[] args)
    {
        try {
            FileInputStream fis = new FileInputStream("./src/test/resources/ExcelFiles/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet s  = wb.getSheet("String");
            int lastrownum = s.getLastRowNum();
            System.out.println("LastRowNum= " +lastrownum);
            Row r = s.getRow(1);

            Cell c = r.getCell(1);
            String value = c.getStringCellValue();
            System.out.println(value);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
