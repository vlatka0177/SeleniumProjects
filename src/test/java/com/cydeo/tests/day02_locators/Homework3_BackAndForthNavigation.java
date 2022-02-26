package com.cydeo.tests.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3_BackAndForthNavigation {

    public static void main(String[] args) {

        /* Homework Task #3: Google Back and Forth Navigation

        1. Set up Chrome Driver, so that Selenium can use it to automate Chrome                                                      */
        WebDriverManager.chromedriver().setup();

        // 2. Create Chrome Driver object to open Chrome browser
        WebDriver driver = new ChromeDriver();

        // 3. Make the page full screen
        driver.manage().window().maximize();

        // 4. Go to: https://google.com
        driver.get("https://www.google.com");

        // 5. Click to Gmail from top right.
        driver.findElement(By.linkText("Gmail")).click();

        /* 6. Verify title contains:
            Expected: Gmail             */
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Gmail title verification PASSED.");
        }else{
            System.out.println("Gmail title verification FAILED.");
        }

        // 7. Go back to Google by using the .back();
        driver.navigate().back();

        /* 8.  Verify title equals:
           Expected: Google              */
        String expectedTitle2 = "Google";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.equals(expectedTitle2)){
            System.out.println("Google title verification PASSED.");
        }else{
            System.out.println("Google title verification FAILED.");
        }

        driver.close();
    }
}
