package org.basicProgram1;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.Random;

import static org.basicProgram1.GenericUtility.randomNo1;

public class RandomDataAccess {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("./src/test/resources/ExcelFiles/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet s=wb.getSheetAt(0);
            int totalNoOfRows=s.getLastRowNum();
           //randomNo1(totalNoOfRows);
            /*Random rand=new Random();
            int randomRowIndex= rand.nextInt(totalNoOfRows)+1;
            System.out.println(randomRowIndex);
            Row r=s.getRow(randomRowIndex)*/
            Row r=s.getRow(randomNo1(totalNoOfRows));
            Cell c=r.getCell(1);
            String value=c.getStringCellValue();
            System.out.println(value);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
