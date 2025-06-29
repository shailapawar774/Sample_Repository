package org.basicProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementActi {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("** Program Starts **");
        GenericUtility gu = new GenericUtility();
        String url = "http://localhost:93/login.do";
        WebDriver driver = gu.startUp("ch", url);

        By userNameObj=By.id("username");
        WebElement userNameField=driver.findElement(userNameObj);
        //WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys("admin");

        By passwordByObj= By.cssSelector(".textField.pwdfield");
        WebElement pwdField = driver.findElement(passwordByObj);
        //WebElement pwdField = driver.findElement(By.cssSelector(".textField.pwdfield"));
        pwdField.sendKeys("manager");

        By loginButtonByObj=By.xpath("//a[@id='loginButton']/div");
        WebElement loginButtonField=driver.findElement(loginButtonByObj);
        //WebElement loginButtonField=driver.findElement(By.xpath("//a[@id='loginButton']/div"));
        loginButtonField.click();

        By logOutByObj=By.xpath(("//a[@id='logoutLink']"));
        WebElement logOutBtnField=driver.findElement(logOutByObj);
        logOutBtnField.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }





    }
}
