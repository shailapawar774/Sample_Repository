package org.basicProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FlipkartNextItem {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("****************** Program Started *****************");
        GenericUtility gu = new GenericUtility();
        WebDriver driver;
        driver = gu.startUp("ch", "https://www.flipkart.com/");
        By mobileSearchByObj = By.xpath("//input[@class='Pke_EE']");
        WebElement searchMobileWebEle = driver.findElement(mobileSearchByObj);
        searchMobileWebEle.sendKeys("iphone 15");
        By searchButtonByObj = By.xpath("//button[@type='submit']");
        WebElement buttonField = driver.findElement(searchButtonByObj);
        buttonField.click();
        FlipkartNextItem.listOfMobileNamenPrize(driver);
    }

    public static void listOfMobileNamenPrize(WebDriver driver) throws InterruptedException {
        By mobNameList = By.xpath("//div[@class='KzDlHZ']");
        By mobPrizeList = By.xpath("//div[@class='Nx9bqj _4b5DiR']");
        By nextButtonByObj = By.xpath("//a[@class='_9QVEpD']/span[text()='Next']");
        //List<WebElement> listOfMobName = driver.findElements(mobNameList);
        //List<WebElement> listOfMobPrize = driver.findElements(mobPrizeList);
        List<WebElement> nextButton=driver.findElements(nextButtonByObj);
        System.out.println();
        System.out.println("****** list of Mobile Names with Their Prizes  ******");
        System.out.println();

        int totalMobCount=0;
        while (! nextButton.isEmpty() ) {

            List<WebElement> listOfMobName = driver.findElements(mobNameList);
            List<WebElement> listOfMobPrize = driver.findElements(mobPrizeList);
            //Thread.sleep(2000);
            for (int j = 0; j < listOfMobName.size(); j++) {

                //System.out.println("********* LIST OF MOB NAMES WITH PRIZES *********");
                WebElement mobNames = listOfMobName.get(j);
                WebElement mobPrizes = listOfMobPrize.get(j);

                System.out.println(mobNames.getText() + "   " + mobPrizes.getText());
                totalMobCount++;

            }
            if(nextButton.isEmpty())
            {
                break;
            }
            else {
                nextButton.get(0).click();
            }
           Thread.sleep(3000);

        }
        //System.out.println("Total No Of Mobiles= " +totalMobCount);
    }

}



