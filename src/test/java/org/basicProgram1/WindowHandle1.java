package org.basicProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle1 {
    public static void main(String[] args) throws InterruptedException {
        GenericUtility gu=new GenericUtility();
        WebDriver driver=gu.startUp("ch","https://demoqa.com/browser-windows");
        String parent_id1=driver.getWindowHandle();
        //System.out.println(parent_id1);
        gu.scrollByPageDown(driver,1);
        //driver.findElement(By.id("tabButton")).click();
        String parent_id2=driver.getWindowHandle();
        //System.out.println(parent_id2);
       Set<String> allWinIds=driver.getWindowHandles();
       Iterator<String> itr=allWinIds.iterator();
       String id=itr.next();
       if(id.equals(parent_id1))
       {
           id= itr.next();
       }
       driver.switchTo().window(id);
       //WebElement ele=driver.findElement(By.id("sampleHeading"));
       WebElement ele=driver.findElement(By.id("messageWindowButton"));
       Thread.sleep(2000);
       ele.click();
        System.out.println(ele.getText());
    }
}
