package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task4_FindElements {

    public static void main(String[] args) {

        /*
        Task 4: Find Elements Task

        1. Open a Chrome browser */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // Provide extra wait time for web driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        /* 3. Locate all the links in the page.
           Windows; Alt + Enter + Enter again
           Mac: Option + Enter + Enter again */
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        // 4. Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());

        /* command + shift + up or down arrows -> moves the entire line on which the cursor is placed

        /* 5. Print out the texts of the links.
              Print out the HREF attribute values of the links
              iter + Enter + all links */
        for (WebElement each : allLinks) {

            System.out.println("Text of link: " + each.getText());
            System.out.println("HREF Values: " + each.getAttribute("href"));
        }

        driver.close();
    }
}

