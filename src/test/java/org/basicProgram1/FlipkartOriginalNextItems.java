package org.basicProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FlipkartOriginalNextItems {
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
        WebElement nextButton = driver.findElement(nextButtonByObj);
        WebElement pageCount=driver.findElement(By.xpath("//div[@class='_1G0WLw']/span[1]"));
        String pageText=pageCount.getText();
        String[] parts=pageText.split(" ");
        int totalMobCount=0;
        int lastPage=Integer.parseInt(parts[3]);
        //int currentPage=Integer.parseInt([1]);

        System.out.println("List of Mob Name and Their Prizes");
        System.out.println();
        for(int i=1;i<=lastPage;i++)
        {
            List<WebElement> listOfMobName = driver.findElements(mobNameList);
            List<WebElement> listOfMobPrize = driver.findElements(mobPrizeList);
            System.out.println(("****** Page " +i+ "*********"));

            for(int j=0;j<listOfMobName.size();j++)
            {
                System.out.println(listOfMobName.get(i).getText() +"     " +listOfMobPrize.get(i).getText());
                totalMobCount++;
            }

            if(i<lastPage)
            {
                nextButton.click();
                Thread.sleep(3000);
            }
            else {
                break;
            }

        }
        System.out.println("Total Mobile Count= " +totalMobCount);
        driver.close();



        }





}








