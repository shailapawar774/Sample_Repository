package org.basicProgram1;
import org.openqa.selenium.WebDriver;


public class ActiTimeAssign {
    public static void main(String[] args) {
            System.out.println("** Program Starts **");
            GenericUtility gu=new GenericUtility();
            String url="http://localhost:93/login.do";
            WebDriver driver=gu.startUp("ch",url);
            String expTitle="actiTIME - Login";
            //String actTitle= driver.getTitle();
            String actTitle=driver.getCurrentUrl();
            String dom=driver.getPageSource();
            System.out.println("Actual Title :" +actTitle);
            System.out.println("Actual Dom :" +dom);
            if(expTitle.equals(actTitle))
            {
                System.out.println("Login Title is as expected");
            }
            else
            {
                System.out.println("Login Title is NOT as expected.");
            }
        }



    }

