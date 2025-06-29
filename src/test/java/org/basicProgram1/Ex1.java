package org.basicProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Programs Start");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp("ch","https://demoqa.com/tool-tips");
        WebElement tooltipbutton=driver.findElement(By.xpath("//button[@id='toolTipButton']"));
        Actions a=new Actions(driver);
        Thread.sleep(2000);
        a.moveToElement(tooltipbutton);
        a.perform();
        String text=driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
        System.out.println(text);
        WebElement tooltip2=driver.findElement(By.xpath("//input[@id='toolTipTextField']"));
        a.moveToElement(tooltip2);
        a.perform();

        System.out.println(driver.findElement(By.xpath("(//button[@id='toolTipButton']/ancestor::body//div[@class='tooltip-inner'])[2]")).getText());



    }
}
 