package practice.testNG1;

import org.testng.annotations.*;

public class AnnotationEx1
{
    @Test(groups = {"Regression","Smoke"})
    public void testMethod1() {
        System.out.println("Test Method 1");
    }
    @Test(groups = {"Regression","Smoke"})
    public void testMethod2() {
        System.out.println("Test Method 2");
    }
    @BeforeMethod(groups = {"Regression","Smoke"})
    public void beforeMethodEx() {
        System.out.println("**** Before Method ****");
    }
    @AfterMethod
    public void afterMethodEx() {
        System.out.println("**** After Method ****");
    }
    @BeforeClass
    public void beforeClassEx() {
        System.out.println("*** Before Class ***");
    }
    @AfterClass
    public void afterClassEx() {
        System.out.println("*** After Class ***");
    }
    @BeforeTest
    public void beforeTestEx() {
        System.out.println("** Before Test **");
    }
    @AfterTest
    public void afterTestEx() {
        System.out.println("** After Test **");
    }
    @BeforeSuite
    public void beforeSuiteEx() {
        System.out.println("* Before Suite *");
    }
    @AfterSuite
    public void afterSuiteEx() {
        System.out.println("* After Suite *");
    }
}




