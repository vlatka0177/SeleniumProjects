package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // 1. Set up the browser driver
        WebDriverManager.chromedriver().setup();

        // 2. Create instance of the Selenium WebDriver. Opens an empty browser.
        WebDriver driver = new ChromeDriver();

        // Maximize the browser size
        driver.manage().window().maximize();

        //driver.manage().window().fullscreen(); // Another option for Mac only.

        // 3. Go to "http://www.tesla.com"
        driver.get("http://www.tesla.com");

        // Get the title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // Use Selenium to navigate back
        driver.navigate().back();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // Use Selenium to navigate forward
        driver.navigate().forward();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        driver.navigate().refresh();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        driver.navigate().to("https://www.google.com");

        // Get the current title after getting to Google page
        currentTitle = driver.getTitle();

       //  System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("currentTitle = " + currentTitle);

        // Get the current URL using Selenium
        currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);

        // Closes a currently opened window
        driver.close();

        // Closes all open windows
        driver.quit();

    }
}
