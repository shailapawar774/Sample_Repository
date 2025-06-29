package org.basicProgram1;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesEx1 {

    public static void main(String[] args) {
        System.out.println("** Program Starts **");

        try {
            FileInputStream fis = new FileInputStream(
                    "./src/test/resources/propertiesFiles/Config.properties");
            Properties prop = new Properties();
            prop.load(fis);
            //String URL = prop.getProperty("url");
            //System.out.println("URL : " + URL);         //prints -> URL : http://localhost:93/login.do

            //similar for other variables of properties file
            System.out.println("Browser Name : " + prop.getProperty("browserName"));
            System.out.println("User Name : " + prop.getProperty("userName"));
            System.out.println("Password : " + prop.getProperty("password"));

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("** Program Ends **");
    }
}
