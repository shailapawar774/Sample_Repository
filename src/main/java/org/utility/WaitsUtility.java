package org.utility;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.*;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;

public class WaitsUtility {
    public void waitForFrameAndSwitchByIndex(WebDriver driver, int time, int frameIndex) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
    }
    public void waitForFrameAndSwitchByIdOrName(WebDriver driver, int time, String nameOrId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameOrId));
    }
    public void waitForFrameAndSwitchByObj2(WebDriver driver, int time, By byObj) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(String.valueOf(byObj)));
    }
    //    public void waitForFrameAndSwitchByObj(WebDriver driver, int time, By byObj) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(byObj)));
//    }
    public void waitForFrameAndSwitchByEle(WebDriver driver, int time, WebElement frameEle) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameEle));
    }
    public void waitForURLContains(WebDriver driver, int time, String partialURL) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.urlContains(partialURL));
    }
    public void waitForURLToBe(WebDriver driver, int time, String exactURL) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.urlToBe(exactURL));
    }
    public void waitForTitleContains(WebDriver driver, int time, String partialTitle) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.titleContains(partialTitle));
    }
    public void waitForTitleIs(WebDriver driver, int time, String exactTitle) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.titleIs(exactTitle));
    }

    public void waitForVisibilityOfEleLocated(WebDriver driver, int time, By byObj) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(byObj));
    }
    public void waitForVisibilityOfEleByObj(WebDriver driver, int time, By byObj) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(byObj)));
    }
    public void waitForVisibilityOfEleType(WebDriver driver, int time, String type, String expression) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        if(type.equalsIgnoreCase("id")) {
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(expression))));
        } else if(type.equalsIgnoreCase("class")) {
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(expression))));
        } else if(type.equalsIgnoreCase("css")) {
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(expression))));
        } else if(type.equalsIgnoreCase("xpath")) {
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(expression))));
        } else if(type.equalsIgnoreCase("linkText")){
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(expression))));}
    }
}
