package org.basicProgram1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenericAlert1 {

        public static void main(String[] args) throws InterruptedException {

            System.out.println("** Program Starts **");
            GenericUtility gu = new GenericUtility();
            String url = "https://demoqa.com/alerts";
            WebDriver driver = gu.startUp("ch", url);
            gu.scrollByPageDown(driver,1);
           // Thread.sleep(3000);
            driver.findElement(By.id("timerAlertButton")).click();
            Thread.sleep(3000);

            if(gu.isAlertPresent(driver, 10)) {
                Alert alt = driver.switchTo().alert();
                String txt = alt.getText();
                System.out.println("Alert TEXT : " + txt);
                Thread.sleep(10000);
                alt.accept();
            }else {
                System.out.println("Alert is not Displayed.");
                //OR
                System.out.println("User is already logged in.");
            }
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@id='alertButton']")).click();
            Thread.sleep(3000);
            String str=driver.switchTo().alert().getText();
            System.out.println(str);

            System.out.println("** Program Ends **");
        }

    }

