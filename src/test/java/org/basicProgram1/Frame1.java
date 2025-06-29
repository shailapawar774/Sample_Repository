package org.basicProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame1 {
    public static void main(String[] args) {
        GenericUtility gu=new GenericUtility();
        WebDriver driver=gu.startUp("ch","https://demoqa.com/frames");
        WebElement frameEle=driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frameEle);
        WebElement ele=driver.findElement(By.id("sampleHeading"));
        System.out.println(ele.getText());
    }
}
