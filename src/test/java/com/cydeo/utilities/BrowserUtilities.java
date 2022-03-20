package com.cydeo.utilities;

// General utility methods. (Not related to a specific page.)

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtilities {

    // This method accepts int (in seconds) and executes Thread.sleep for the given duration.

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e) {
        }
    }

    /* This method accepts 3 arguments.
       Argument 1: WebDriver
       Argument 2: expectedInUrl
                        - verify if the URL contains a given String
                        - a matching condition breaks the loop
       Argument 3: expectedInTitle is compared against actualTitle  */

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle){

        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles) {

            driver.switchTo().window(each);

            System.out.println("Current URL: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        // Assert that title contains “expectedInTitle”
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    // This method accepts a String "expectedTitle" and Asserts if it is true
    public static void verifyTitle(WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }


   // Creating a utility method for ExplicitWait, so we don't have to repeat the lines
    public static void waitForInvisibilityOf(WebElement webElement){
        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }
}
