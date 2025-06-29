package org.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtility {

        public Properties getPropObj() {
            try {
                FileInputStream fis = new FileInputStream(
                        "./src/test/resources/propertiesFiles/Config.properties");
                Properties prop = new Properties();
                prop.load(fis);
                return prop;

            } catch (Exception e) {
                //e.printStackTrace();
                return null;
            }
        }

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
                //e.printStackTrace();
                return null;
            }
        }
    }

