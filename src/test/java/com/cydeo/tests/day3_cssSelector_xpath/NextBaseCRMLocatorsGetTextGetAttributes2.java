package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NextBaseCRMLocatorsGetTextGetAttributes2 {

    public static void main(String[] args) {

        /* Task #3: NextBaseCRM, locators, getText(), getAttribute() practice

        1. Open a Chrome browser                              */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2. Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        /* 3. Verify "Log in" button text is as expected:
           Expected: Log In
           Right click on Log In button + Inspect

        WebElement signInButton = driver.findElement(By.className("login-btn"));

        LOCATING THE SAME WEB ELEMENT BY USING DIFFERENT ATTRIBUTE VALUES

         	                   tagName[attribute='value']
        	                   input[class='login-btn']

        BY CLASS ATTRIBUTE
        WebElement signInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));

        BY TYPE ATTRIBUTE
        WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));

        BY VALUE ATTRIBUTE                                       */
        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        String expectedButtonText = "Log In";

        //Getting the value of the attribute "value"
        String actualButtonText = signInButton.getAttribute("value");

        System.out.println("actualButtonText = " + actualButtonText);

        if (actualButtonText.equals(expectedButtonText)) {
            System.out.println("Log in button text verification PASSED.");
        } else {
            System.out.println("Log in button text verification FAILED.");
        }
    }
}
