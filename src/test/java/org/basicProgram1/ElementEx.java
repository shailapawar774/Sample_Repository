package org.basicProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import java.util.List;

public class ElementEx {
    public static void main(String[] args) {
        System.out.println("********Program Start***********");
        GenericUtility gu=new GenericUtility();
        WebDriver driver=gu.startUp("ch","http://localhost:93/login.do");
        //WebElement userNameField= driver.findElement(By.id("username123"));
        List<WebElement> allEles1=driver.findElements(By.id("username"));
        System.out.println("allEles1 Size = "+ allEles1.size());
        System.out.println("allEles1 Empty = " +allEles1.isEmpty());

        List<WebElement> allEles2= driver.findElements(By.id("username123"));
        System.out.println("allEles2 Size=" +allEles2.size());
        System.out.println("allEles2 Empty = " +allEles1.isEmpty());

    }
}
