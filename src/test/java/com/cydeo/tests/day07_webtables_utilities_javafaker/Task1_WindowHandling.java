package com.cydeo.tests.day07_webtables_utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class Task1_WindowHandling {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

        // 1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void window_handling_test() {

        // 2. Go to: https://www.amazon.com
        driver.get("https://www.amazon.com");

        /* 3. Copy-paste the lines to open three new tabs with three new pages: Google, Etsy, Facebook.
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');"); */
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

        // 4. Create a logic to switch to the tab where Etsy.com is open
        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles) { // iter + enter

            driver.switchTo().window(each);

            System.out.println("Current URL: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains("etsy")) {
                break;
            }
        }
        //5. Assert:Title contains “Etsy”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Etsy";

        assertTrue(actualTitle.contains(expectedTitle)); // import static method Assert.assertTrue()
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
