package org.basicProgram1;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class AddCustFromExcel {
    public static void main(String[] args) {
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(gu.getPropData("browserName"),gu.getPropData("url6"));

        try{
            FileInputStream fis = new FileInputStream("./src/test/resources/ExcelFiles/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet s = wb.getSheetAt(3);
            //int totalNoOfRows = s.getLastRowNum();
            Row r = s.getRow(1);
           // int totalNoOfCell = r.getLastCellNum();
            Cell c =r.getCell(0);
            String value = c.getStringCellValue();
            driver.findElement(By.xpath("//input[@id='username']")).sendKeys(value);
            Cell c1 =r.getCell(1);
            String value1 = c1.getStringCellValue();
            //System.out.println(value1);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys(value1);
            driver.findElement(By.xpath("//a[@id='loginButton']")).click();
            //Thread.sleep(2000);
            driver.findElement(By.xpath("//a[@class='content tasks']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//div[@class='title ellipsis'])[1]")).click();
            driver.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
            //String custName = s.getRow(2).getCell(0).getStringCellValue();
            driver.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys(s.getRow(2).getCell(0).getStringCellValue());
            driver.findElement(By.xpath("//input[@id='customerLightBox_descriptionField']")).sendKeys(s.getRow(2).getCell(1).getStringCellValue());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    }

