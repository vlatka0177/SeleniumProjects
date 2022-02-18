package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class Task4_iFramePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        // 1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to website: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void iFrame_test(){

        /* Driver's focus has to be switched to iFrame

        Option 1: switching to iframe by using id attribute value  */
        driver.switchTo().frame("mce_0_ifr");

        /* Option 2:switching to iframe by passing the index number of iframe
        driver.switchTo().frame(0);

        Option 3: switching to iframe by locating a web element and passing in frame() method
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        Locate the p tag  */
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        assertTrue(yourContentGoesHereText.isDisplayed()); // Import static method Assert.assertTrue()

        /* Verify an iFrame containing the TinyMCE WYSIWYG Editor
        Switch the driver back to 'main HTML' */
        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        // Assertion whether the header text is displayed or not
        assertTrue(headerText.isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
