package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoTitleAndUrlVerification {

    public static void main(String[] args) {

        // Homework Task #1 Cydeo Title and URL Verification

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");
        // driver.navigate().to("https://practice.cydeo.com");

        String expectedUrl = "cydeo";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("URL is as expected. URL verification PASSED.");
        } else {
            System.out.println("URL is not as expected. URL verification FAILED.");
        }

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title is as expected. Title verification PASSED.");
        } else {
            System.out.println("Title is not as expected. Title verification FAILED.");
        }

        driver.close();
    }
}
