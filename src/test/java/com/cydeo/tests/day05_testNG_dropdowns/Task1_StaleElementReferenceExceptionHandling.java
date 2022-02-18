package com.cydeo.tests.day05_testNG_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task1_StaleElementReferenceExceptionHandling {

    public static void main(String[] args) throws InterruptedException{

        /* Task #1: Stale Element Reference Exception Handling

        1. Open Chrome browser */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        /* 3. Click to “Add Element” button
        button[@onclick='addElement()'] */
        WebElement addElementBtn = driver.findElement(By.xpath("//button[.='Add Element']"));
        Thread.sleep(2000);
        addElementBtn.click();

        // 4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        // 5. Click to “Delete” button.
        deleteButton.click();

        /* 6. Verify “Delete” button is NOT displayed after clicking.
        2.command + option + T to surround with throw/catch to handle StaleElementReferenceException */
        try {
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed()); // 1. exception
        } catch (StaleElementReferenceException e) {

            System.out.println("StaleElementReferenceException exception is thrown.");
            System.out.println("The web element is completely deleted from the page.");
            System.out.println("deleteButton.isDisplayed() = false.");
        }
    }
}
