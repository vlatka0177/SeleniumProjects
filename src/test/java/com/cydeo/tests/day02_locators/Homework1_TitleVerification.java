package com.cydeo.tests.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1_TitleVerification {

    public static void main(String[] args) {

        /*
        Homework Task #1: Etsy Title Verification

        1. Set up Chrome Driver, so that Selenium can use it to automate Chrome     */
        WebDriverManager.chromedriver().setup();

        // 2. Create Chrome Driver object to open Chrome browser
        WebDriver driver = new ChromeDriver();

        // 3. Make the page full screen
        driver.manage().window().maximize();

        // 4. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        // 5. Search for "wooden spoon".
        WebElement etsySearchBox = driver.findElement(By.name("search_query"));
        etsySearchBox.sendKeys("wooden spoon" + Keys.ENTER);

        /* 6. Verify title:
           Expected: Wooden spoon | Etsy           */
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED.");
        }else{
            System.out.println("Title is not as expected. Verification FAILED.");
        }

        driver.close();
    }
}
