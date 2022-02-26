package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task6_StaleElementReferenceException {

    public static void main(String[] args) {

        /* Task #6:StaleElementReferenceException

         1- Open a Chrome browser */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // Provide extra wait time for web driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        // 3- Locate “Cydeo” link. Verify it is displayed.
        WebElement cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));

        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        // 4- Refresh the page.
        driver.navigate().refresh();

        // Refresh the web element reference by re-assigning (relocating) the web element
        cydeoLink = driver.findElement(By.xpath("//a[text()='CYDEO']"));

        // 5- Verify again that it is displayed.
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        driver.close();
    }
}
