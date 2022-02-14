package com.cydeo.tests.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeaderVerification {

    public static void main(String[] args) {

    /*
    Homework Task #2: Zero Bank Verification

        1. Set up Chrome Driver, so that Selenium can use it to automate Chrome     */
        WebDriverManager.chromedriver().setup();

        // 2. Create Chrome Driver object to open Chrome browser
        WebDriver driver = new ChromeDriver();

        // 3. Make the page full screen
        driver.manage().window().maximize();

        // 4. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html ");

        // 5. Verify that header text is as expected:
        WebElement headerText = driver.findElement(By.tagName("h3"));
        // Expected: Log in to ZeroBank
        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = headerText.getText(); // will return "Log in to ZeroBank" as String

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text verification PASSED.");
        }else{
            System.out.println("Header text verification FAILED.");
        }

        driver.close();
    }
}
