package org.basicProgram1;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;


public class Excel1 {
    public static void main(String[] args) {
        System.out.println("**********  Program Starts ***********");
        try{
            FileInputStream fis = new FileInputStream("./src/test/resources/ExcelFiles/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            int totalNoOfSheets = wb.getNumberOfSheets();
            System.out.println("Total No Of Sheets = " +totalNoOfSheets);
            //System.out.println(wb.getSheetName(0));
            for(int i=0;i<totalNoOfSheets;i++)
            {
                System.out.println("Sheet " +i+ "th Name = " +wb.getSheetName(i));
            }
            System.out.println("***********");
            for(int a=0;a<totalNoOfSheets;a++)
            {
                System.out.println("Index of " +a+ "th Sheet =" +wb.getSheetIndex("String"));
            }
        }
         catch (Exception e) {
             System.out.println("Error In Reading Excel file");
             e.printStackTrace();

        }
    }

}
