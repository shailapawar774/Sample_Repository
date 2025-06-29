package sample.testNG2;

import org.basicProgram1.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Sample1 {
    @Test(priority = -50,groups={"Regression"})
    public void verifyLoginPageTitle() {
        System.out.println("Verify Login Page Title ");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(gu.getPropData("browserName"), gu.getPropData("url2"));
        String expTitle = "actiTIME - Login";
        String actTitle = driver.getTitle();
        if (expTitle.equals(actTitle)) {
            System.out.println("Login Title is as Expected");
        } else {
            System.out.println("LOgin Title is Not as Expected");
            System.out.println("LOgin Title is Not as Expected");

        }
        driver.quit();
    }

    @Test(groups= {"Regression","Smoke"})
    public void verifyLoginURL() {
        System.out.println("Verify Login URL");
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(gu.getPropData("browserName"), gu.getPropData("url22"));
        String expURL = "http://localhost:93/login.do";
        String actURL = driver.getCurrentUrl();
        if (expURL.equals(actURL)) {
            System.out.println("Login URL is As Expected");
        } else {
            System.out.println("Login URL is Not As Expected");
        }
    }

    @Test(groups = {"smoke"})
    public void verifyLoginFunctionality() {
        GenericUtility gu = new GenericUtility();
        WebDriver driver = gu.startUp(gu.getPropData("browserName"), gu.getPropData("url2"));
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
        driver.findElement(By.xpath("//a[@id='loginButton']")).click();
        if (driver.findElement(By.xpath("//a[@class='content selected tt']")).isDisplayed()) {
            System.out.println("DAshBoard is Displayed");
        } else {
            System.out.println("DashBoard is Not Visible");
        }
        driver.findElement(By.id("logoutLink")).click();
        driver.quit();
    }
}
