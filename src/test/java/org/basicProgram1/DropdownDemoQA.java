package org.basicProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

//import java.util.List;

public class DropdownDemoQA {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("*******  Program Started ********");
        GenericUtility gu=new GenericUtility();
        WebDriver driver;
        driver = gu.startUp("ch","https://demoqa.com/select-menu");

        driver.findElement(By.id("withOptGroup")).click();
        driver.findElement(By.xpath("//div[text()='Group 1, option 2']")).click();
        driver.findElement(By.id("selectOne")).click();
        driver.findElement(By.xpath("//div[text()='Mr.']")).click();

        driver.findElement(By.xpath(" //div/div/div[@class=' css-1wa3eu0-placeholder' and text()='Select...']")).click();
        driver.findElement(By.id("react-select-4-option-0")).click();
        driver.findElement(By.id("react-select-4-option-1")).click();
        driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[3]")).click();


        //Select sel=new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
        //sel.selectByContainsVisibleText("Wh");
        /*sel.selectByIndex(0);
        Thread.sleep(3000);
        sel.selectByValue("8");
        Thread.sleep(3000);
        sel.selectByContainsVisibleText("Wh");
        Thread.sleep(3000);
        sel.selectByVisibleText("Red");*/

        /*List<WebElement> ddl= sel.getOptions();

        for(int i=0;i<ddl.size();i++)
        {
            sel.selectByIndex(i);
            Thread.sleep(3000);
            System.out.println(ddl.get(i).getText());
        }*/

    }
}
