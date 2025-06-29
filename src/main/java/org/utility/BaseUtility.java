package org.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseUtility {
    public WebDriver startUp(String browserName, String url) {
        WebDriver driver = null;
        if (browserName.equalsIgnoreCase("ch")
                || browserName.equalsIgnoreCase("chrome")) {
            //driver = new ChromeDriver();       //upcasted obj and opens browser
            //OR
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");
            //options.addArguments("--headless");
            driver = new ChromeDriver(options);

        } else if (browserName.equalsIgnoreCase("edge")) {
            //driver = new EdgeDriver();       //upcasted obj and opens browser
            //OR
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-notifications");
            options.addArguments("--headless");
            driver = new EdgeDriver(options);       //upcasted obj and opens browser

        } else if (browserName.equalsIgnoreCase("ff")
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
        return driver;
    }
}




