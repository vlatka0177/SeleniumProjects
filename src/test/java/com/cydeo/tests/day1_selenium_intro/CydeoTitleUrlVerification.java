package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoTitleUrlVerification {

    public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();

    driver.get("https://practice.cydeo.com");

    String expectedTitle = "practice";

    String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification PASSED.");
        }else{
            System.out.println("Title is not as expected. Verification FAILED.");

            String expectedUrl = "cydeo";

            String actualUrl = driver.getCurrentUrl();

            if (actualUrl.equals(expectedUrl)){
                System.out.println("Title is as expected. Verification PASSED.");
            }else{
                System.out.println("Title is not as expected. Verification FAILED.");


        }
    }
}
