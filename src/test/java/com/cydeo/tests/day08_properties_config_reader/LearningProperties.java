package com.cydeo.tests.day08_properties_config_reader;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void javaPropertiesReadingTest() {

        /* key = value
           os.name = Mac OS X
           user.name = cybertekchicago-1  */

        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
    }
}
