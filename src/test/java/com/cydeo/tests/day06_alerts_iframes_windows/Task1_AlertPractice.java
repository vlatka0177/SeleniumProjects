package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1_AlertPractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        // 1. Open browser

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to website: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alert_test1(){
        // 3. Click to “Click for JS Alert” button
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        // . stands for text

        informationAlertButton.click();

        // to be able to click to Alert OK button, the driver's focus needs to be switched to Alert itself
        Alert alert = driver.switchTo().alert();

        // 4. Click to OK button from the alert
        alert.accept();

        // 5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        // Failure message will only be displayed if assertionfials: "Result text is NOT displayed."
        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed.");

        String expectedText = "you successfully clicked on an alert.";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText, expectedText, "Actual result test is not as expected.");

    }
}
