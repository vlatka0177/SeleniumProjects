package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_TitleVerification {

    public static void main(String[] args) {
        /*
        Task #1: Yahoo Title Verification

        Tip: Run your code every few lines

        1. Set up Chrome Driver, so that Selenium can use it to automate Chrome     */
        WebDriverManager.chromedriver().setup();

        // 2. Create Chrome Driver object to Open Chrome browser
        WebDriver driver = new ChromeDriver();

        // 3. Make the page full screen
        driver.manage().window().maximize();

        // 4. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        /* 5. Verify title:
           Expected: Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos */
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        // Actual title comes from the browser
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED.");
        }else{
            System.out.println("Title is not as expected. Verification FAILED.");
        }

        driver.close();
    }
}
