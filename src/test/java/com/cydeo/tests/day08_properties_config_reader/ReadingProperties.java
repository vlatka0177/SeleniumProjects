package com.cydeo.tests.day08_properties_config_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void readingFromPropertiesTest() throws IOException {

        // 1. Create the object of Properties
        Properties properties = new Properties();

        // 2. Open the file in Java memory: FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties"); // throws FileNotFoundException
        /* 1. configuration properties
           2. copy path/reference
           3. Path from content root
           4. Paste it in the FileInputStream()   */

        // 3. Load the properties' object by using fileInputStream object
        properties.load(file); // throws IOException

        // 4. Use properties' object to read the value
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
    }
}
