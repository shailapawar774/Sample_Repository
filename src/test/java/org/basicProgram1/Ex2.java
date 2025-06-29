package org.basicProgram1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex2 {
    public static void main(String[] args) {
        Ex2 obj2=new Ex2();
        obj2.initBrowser("ch");


    }
    public void initBrowser(String browserName)
    {
        WebDriver driver=null;
        if(browserName.equalsIgnoreCase("ch")||browserName.equalsIgnoreCase("chrome"))
        {
            //ChromeDriver objCh=new ChromeDriver();
            driver=new ChromeDriver();
            driver.manage().window().setSize(new Dimension(450,600));
            System.out.println("Open Chrome Browser");

        }
        else if(browserName.equalsIgnoreCase("edge")||browserName.equalsIgnoreCase("edge"))
        {
            driver=new EdgeDriver();
            //EdgeDriver objEdge=new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().window().minimize();
            System.out.println("Open Edge Browser");


        }
        else
        {
               System.out.println("Invalid browserName");

        }
    }

}
