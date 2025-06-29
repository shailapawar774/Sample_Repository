package org.basicProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;


public class GooglePractice1 {
    public static void main(String[] args) throws InterruptedException {
        GenericUtility gu = new GenericUtility();

        WebDriver driver = gu.startUp(gu.getPropData("browserName"),gu.getPropData("url3"));
//Thread.sleep(3000);
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Automation");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//div[@class='a4bIc']")).click();
        List<WebElement>  listOfAutomation = driver.findElements(By.xpath("//ul/li[@role='presentation']//div[@class='wM6W7d']/span"));
        //div[@role="presentation"]/span  ----->common xpath for automation name search

        for (int i=0; i <  listOfAutomation.size();i++)
        {
            System.out.println(listOfAutomation.get(i).getText());
        }
        /*driver.findElement(By.xpath("(//div[@class='kHtcsd']/span)[1]")).click();
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER);
        //actions.build().perform();
        driver.navigate().forward();*/
        //gu.clickByJS(driver);
        //gu.enterByActions(driver);
        //driver.findElement(By.xpath("//span[@class='KlpaXd z1asCe MZy1Rb']")).click();
        //driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md' and text()='WhatsApp Web'])[1]")).click();
       //ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        //driver.switchTo().window(tab.get(3));


    }
}
