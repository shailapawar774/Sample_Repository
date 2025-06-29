package org.utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility {
    public void scrollByActions(WebDriver driver, WebElement ele) {
        Actions act = new Actions(driver);
        act.scrollToElement(ele).perform();
    }
    public void sendKeysByActions(WebDriver driver, WebElement ele, String data) {
        Actions act = new Actions(driver);
        act.sendKeys(ele, data).perform();
    }
    public void clickByActions(WebDriver driver, WebElement ele) {
        Actions act = new Actions(driver);
        act.click();
        // act.sendKeys(Keys.TAB);
        act.build().perform();

    }

    public void enterByActions(WebDriver driver)
    {
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();

    }


}
