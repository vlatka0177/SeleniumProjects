package com.cydeo.tests.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework4_LinkLocatorAndTitleVerification {

    public static void main(String[] args) {

        /* Homework Task #4: Cydeo Link Locator and Title Verification

        1. Set up Chrome Driver, so that Selenium can use it to automate Chrome                                                      */
        WebDriverManager.chromedriver().setup();

        // 2. Create Chrome Driver object to open Chrome browser
        WebDriver driver = new ChromeDriver();

        // 3. Make the page full screen
        driver.manage().window().maximize();

        // 4. Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        // 5. Locate "Home" link by using className locator. Click to “Home” link
        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.sendKeys("Home");
        homeLink.click();

        /* 6. Verify title is as expected:
           Expected: Practice               */
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title is as expected. Title verification PASSED.");
        } else {
            System.out.println("Title is not as expected. Title verification FAILED.");
        }

        driver.close();
    }
}
