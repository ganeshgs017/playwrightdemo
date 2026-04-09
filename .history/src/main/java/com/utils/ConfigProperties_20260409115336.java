package com.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigProperties {

    private static Properties prop;

    static{

        try {
            
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            prop = new Properties();
            prop.load(fis);
            
        } catch (Exception e) {
            
        }
    }

}
