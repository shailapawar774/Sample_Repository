package org.basicProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetAttribute_Text1 {
    public static void main(String[] args) {
        System.out.println("**********Program Starts***********");
        GenericUtility gu=new GenericUtility();
        WebDriver driver= gu.startUp("ch","http://localhost:93/login.do");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
        WebElement loginButn;
        driver.findElement(By.cssSelector("#loginButton>div")).click();
        //loginButn.click();
        loginButn=driver.findElement(By.cssSelector("#loginButton>div"));
    }
}
