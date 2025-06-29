package org.basicProgram1;

import org.openqa.selenium.WebDriver;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("*********Program Start**********");
        GenericUtility gu=new GenericUtility();
       // WebDriver driver=gu.initBrowser("ch");
        gu.startUp("ch","https://www.amazon.com/");
        System.out.println("*********Program Start**********");
    }
}
