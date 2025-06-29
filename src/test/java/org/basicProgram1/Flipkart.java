package org.basicProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("*********** Program Start **********");
        GenericUtility gu=new GenericUtility();
        WebDriver driver=gu.startUp("ch","https://www.flipkart.com/");
        Thread.sleep(15000);

        Actions act = new Actions(driver);
        WebElement fashion=driver.findElement(By.xpath("(//div[@class='YBLJE4'])[3]"));
        act.moveToElement(fashion).perform();
        Thread.sleep(5000);

        WebElement womenFashion=driver.findElement(By.xpath("//a[@class='_1BJVlg'][2]"));
        act.moveToElement(womenFashion).perform();
        Thread.sleep(5000);


        By searchMoblieByObj=By.xpath("//input[@class='Pke_EE']");
        WebElement searchMobile=driver.findElement(searchMoblieByObj);
        searchMobile.sendKeys("iphone 15");

        By buttonByObj=By.xpath("//button[@type='submit']");
        WebElement buttonField=driver.findElement(buttonByObj);
        Thread.sleep(3000);
        buttonField.click();

        By mobileTextByObj=By.xpath("//span[@class='BUOuZu']");
        WebElement mobileSearchField=driver.findElement(mobileTextByObj);
        String text=mobileSearchField.getText();
        System.out.println(text);
        String[] ss=text.split("of");
        String token2=null;
        for(int i=0;i<ss.length;i++)
        {
            System.out.println(ss[i]);
            token2=ss[1];
        }
        System.out.println("Token2" +token2);
        //Thread.sleep(2000);
        String[] sss=token2.split(" ");
        //System.out.println(sss);
        String token3=null;
        for(int i=0;i<sss.length;i++)
        {
            //System.out.println(sss[i]);
            token3=sss[1];
            //System.out.println("Count =" +token3);
        }
        System.out.println("Count =" +token3);




    }
}
