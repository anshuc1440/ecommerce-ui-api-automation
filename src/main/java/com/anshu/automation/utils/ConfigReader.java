package com.anshu.automation.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    private ConfigReader() {
        // prevent object creation
    }

    public static Properties loadProperties() {
        try {
            if (properties == null) {
                FileInputStream fis = new FileInputStream(
                        System.getProperty("user.dir")
                        + "/src/test/resources/config.properties");

                properties = new Properties();
                properties.load(fis);
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
        return properties;
    }

    public static String get(String key) {
        return loadProperties().getProperty(key);
    }
}
