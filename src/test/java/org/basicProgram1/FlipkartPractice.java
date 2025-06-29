package org.basicProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.util.Properties;

public class FlipkartPractice {
    public static void main(String[] args) throws InterruptedException {
       GenericUtility gu = new GenericUtility();
       WebDriver driver = gu.startUp(gu.getPropData("browserName"),gu.getPropData("url5"));
       gu.scrollByPageDown(driver,1);
       driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("shaila33pawar@gmail.com");
       driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("S@nish241122");
       driver.findElement(By.xpath("//span[text()='Sign In']")).click();
       WebElement we = driver.findElement(By.xpath("//span[text()='Women']"));
       Actions act = new Actions(driver);
       act.moveToElement(we);
       act.perform();
       driver.findElement(By.xpath("(//span[text()='Tops'])[1]"));
       act.moveToElement(driver.findElement(By.xpath("(//span[text()='Tops'])[1]")));
       act.perform();
       act.moveToElement(driver.findElement(By.xpath("//span[text()='Jackets']"))).click();
       act.perform();
       gu.scrollByPageDown(driver,2);
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//a[@class='product-item-link'])[1]")).click();
       driver.findElement(By.xpath("//div[@aria-label='M']")).click();
       driver.findElement(By.xpath("//div[@aria-label='Black']")).click();
       driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[@class='action showcart']")).click();
       driver.findElement(By.xpath("//button[@title='Proceed to Checkout']")).click();
       gu.scrollByPageDown(driver,2);
       driver.findElement(By.xpath("//input[@id='M67DR2C']")).sendKeys("tanu");
       driver.findElement(By.xpath("//input[@id='H13LVQV']")).sendKeys("godge");
       gu.scrollByPageDown(driver,2000);
       driver.findElement(By.xpath("//input[@id='AJ1PMNH']")).sendKeys("Kunjirwadi");
        driver.findElement(By.xpath("//input[@id='SJSA7TV']")).sendKeys("pune");
        driver.findElement(By.xpath("(//select[@class='select'])[1]")).click();






    }
}
