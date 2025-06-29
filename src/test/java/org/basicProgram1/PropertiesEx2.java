package org.basicProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesEx2 {
    public static void main(String[] args) {
        GenericUtility gu=new GenericUtility();
        WebDriver driver = gu.startUp("ch", gu.getPropData("url2"));
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(gu.getPropData("userName"));
        driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys(gu.getPropData("password"));
        driver.findElement(By.xpath("//a[@id='loginButton']")).click();
    }

}
