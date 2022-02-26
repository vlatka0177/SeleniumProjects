package com.cydeo.tests.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4_LibraryLogInPage {

    public static void main(String[] args) {

       /*  Task #4 Library Verification

       1. Open a Chrome browser                              */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to: https://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");

        // 3. Enter username: "incorrect@email.com"
        WebElement usernameInput = driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@email.com");

        // 4. Enter password: "incorrect password"
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");

        // 5. Click to sign in button
        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();

        // Verify visually that "Sorry, Wrong Email or Password" is displayed

        driver.close();
    }
}
