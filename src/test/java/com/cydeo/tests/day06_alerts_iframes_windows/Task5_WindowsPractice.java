package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class Task5_WindowsPractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        // 1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to website: https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multipleWindowTest() {

        // Store the handle of the main page window as a String
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        // 4. Assert that title is "Windows".
        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();

        assertEquals(actualTitle, expectedTitle); // import static Assert.assertEquals(actualTitle, expectedTitle)
        System.out.println("Title before click: " + actualTitle);

        // 5. Click to "Click Here" link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        // 6. Switch to new Window.
        Set<String> allWindowHandles = driver.getWindowHandles();
        // window handle 1 - main window
        // window handle 2 - 2nd window

        for (String each : allWindowHandles) {

            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: " + driver.getTitle());
        }

            // 7. Assert that title is "New Window".
            String expectedTitleAfterClick = "New Window";
            actualTitle = driver.getTitle();

            Assert.assertEquals(actualTitle, expectedTitleAfterClick);
            System.out.println("Title after click: " + actualTitle);

            /* to go back to the main page, use already stored main handle
               driver.switchTo().window(mainHandle);  */
        }

        @AfterMethod
        public void tearDown() {
        driver.close();
    }
}
