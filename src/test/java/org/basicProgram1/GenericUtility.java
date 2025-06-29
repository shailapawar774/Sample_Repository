package org.basicProgram1;
import java.util.Properties;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Random;

public class GenericUtility {
    public String getPropData(String key) {
        try {
            FileInputStream fis = new FileInputStream(
                    "./src/test/resources/propertiesFiles/Config.properties");
            Properties prop = new Properties();
            prop.load(fis);
//            String value = prop.getProperty(key);
//            return value;
            //OR
            return prop.getProperty(key);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int randomNo1(int randomNo) {

        Random randomnum = new Random();
        int result = randomnum.nextInt(randomNo);
        return result;
    }



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


    public boolean isAlertPresent(WebDriver driver, int time) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
            wait.until(ExpectedConditions.alertIsPresent());
            return true;
        } catch(Exception e) {
            return false;
        }
    }
    public void scrollByPageUp(WebDriver driver,int numOfScrolls)
    {
        WebElement ele=driver.findElement(By.xpath("//html"));
        for(int i=0; i < numOfScrolls; i++) {
            ele.sendKeys(Keys.PAGE_UP);
        }
    }
    public void scrollByPageDown(WebDriver driver, int numOfScrolls) {
        WebElement ele = driver.findElement(By.xpath("//html"));
        for(int i=0; i < numOfScrolls; i++) {
            ele.sendKeys(Keys.PAGE_DOWN);
        }
    }
    public void clickByJS(WebDriver driver, WebElement ele) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", ele);
    }
    public void scrollByJS(WebDriver driver, WebElement ele) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", ele);
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
    public WebDriver startUp(String browserName, String url) {
    WebDriver driver = null;
    if(browserName.equalsIgnoreCase("ch")
            || browserName.equalsIgnoreCase("chrome")) {
        //driver = new ChromeDriver();       //upcasted obj and opens browser
        //OR
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        //options.addArguments("--headless");
        driver = new ChromeDriver(options);

    } else if(browserName.equalsIgnoreCase("edge")) {
        //driver = new EdgeDriver();       //upcasted obj and opens browser
        //OR
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--headless");
        driver = new EdgeDriver(options);       //upcasted obj and opens browser

    } else if(browserName.equalsIgnoreCase("ff")
            || browserName.equalsIgnoreCase("firefox")) {
        driver = new FirefoxDriver();
        //OR
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--headless");
        driver = new FirefoxDriver(options);
    } else {
        System.out.println("Invalid browser name...!!!");
    }
    //driver.manage().window().maximize();     //maximize the browser
    //driver.manage().window().minimize();        //minimize the browser
    //driver.manage().window().setSize(new Dimension(450, 600));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get(url);
    return driver;
}
public WebDriver initBrowser(String browserName) {
    WebDriver driver = null;
    if(browserName.equalsIgnoreCase("ch")
            || browserName.equalsIgnoreCase("chrome")) {
        //driver = new ChromeDriver();       //upcasted obj and opens browser
        //OR
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        //options.addArguments("--headless");
        driver = new ChromeDriver(options);

    } else if(browserName.equalsIgnoreCase("edge")) {
        //driver = new EdgeDriver();       //upcasted obj and opens browser
        //OR
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--headless");
        driver = new EdgeDriver(options);       //upcasted obj and opens browser

    } else if(browserName.equalsIgnoreCase("ff")
            || browserName.equalsIgnoreCase("firefox")) {
        driver = new FirefoxDriver();
        //OR
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--headless");
        driver = new FirefoxDriver(options);
    } else {
        System.out.println("Invalid browser name...!!!");
    }
    //driver.manage().window().maximize();     //maximize the browser
    //driver.manage().window().minimize();        //minimize the browser
    //driver.manage().window().setSize(new Dimension(450, 600));

    return driver;
}
}


