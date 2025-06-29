package org.basicProgram1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("******Program Starts****");
        Ex3 obj3=new Ex3();
        obj3.initBrowser("ch");

    }
    public void initBrowser(String browserName)
    {
        WebDriver driver=null;
        if(browserName.equalsIgnoreCase("ch")||browserName.equalsIgnoreCase("chrome"))
        {
            ChromeOptions options=new ChromeOptions();
            options.addArguments("Start-maximized");
            options.addArguments("--disable-notifications");

            driver=new ChromeDriver(options);

        }
        else
        {
            System.out.println("Invalid Browser Name");

        }
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(450,600));
    }
}
