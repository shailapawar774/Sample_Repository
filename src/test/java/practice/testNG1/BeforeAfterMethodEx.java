package practice.testNG1;

import org.basicProgram1.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.PropertiesUtility;

import java.util.Properties;

public class BeforeAfterMethodEx {
    private WebDriver driver;   //null

    @BeforeMethod
    public void launchBrowser() {
        //open browser
        PropertiesUtility pu = new PropertiesUtility();
        Properties prop = pu.getPropObj();
        GenericUtility gu = new GenericUtility();
        driver = gu.startUp(prop.getProperty("browserName"), prop.getProperty("url2"));
    }
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
    @Test
    public void verifyLoginTitle() {
        System.out.println("** Verify Login Title Starts **");
        String expTitle = "actiTIME - Login";
        String actTitle = driver.getTitle();
        if(expTitle.equals(actTitle)) {
            System.out.println("Login Title is as expected.");
        } else {
            System.out.println("Login Title is NOT as expected.");
        }
        System.out.println("** Verify Login Title Ends **");
    }
    @Test
    public void verifyLoginURL() {
        System.out.println("** Verify Login URL Starts **");
        String expTitle = "http://localhost:93/login.do";
        String actTitle = driver.getCurrentUrl();
        if(expTitle.equals(actTitle)) {
            System.out.println("Login URL is as expected.");
        } else {
            System.out.println("Login URL is NOT as expected.");
        }
        System.out.println("** Verify Login URL Ends **");
    }
    @Test
    public void verifyLoginFunctionality() throws InterruptedException {
        System.out.println("** Verify Login Functionality Starts **");
        driver.findElement(By.id("username")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
        driver.findElement(By.cssSelector("#loginButton>div")).click();

        if(driver.findElement(By.cssSelector(".content.selected.tt")).isDisplayed()) {
            System.out.println("Dashboard page is displayed.");
        } else {
            System.out.println("Dashboard page is displayed.");
        }
        driver.findElement(By.id("logoutLink")).click();
        System.out.println("** Verify Login Functionality Ends **");
    }

    @Test(groups = {"regression"})
    public void test123(){
        System.out.println("Test123");
    }
}
