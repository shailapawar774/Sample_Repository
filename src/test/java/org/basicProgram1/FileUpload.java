package org.basicProgram1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUpload {
    public static void main(String[] args) throws AWTException, InterruptedException {
        GenericUtility gu=new GenericUtility();
        WebDriver driver = gu.startUp("ch","https://demoqa.com/upload-download");
        gu.scrollByPageDown(driver,1);
       // driver.findElement(By.id("uploadFile")).sendKeys("F:/Workspace/Maven/src/test/resources/FileUploads/SampleTextFile.docx");
        WebElement uploadButton=driver.findElement(By.id("uploadFile"));
        uploadButton.click();
        Thread.sleep(2000);
        String fileToUpload = System.getProperty("./src/test/resources/FileUploads/SampleTextFile.docx");
        StringSelection ss = new StringSelection(fileToUpload);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        System.out.println("** Program Ends **");


    }
}
