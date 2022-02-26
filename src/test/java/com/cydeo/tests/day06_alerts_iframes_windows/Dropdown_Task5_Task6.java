package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Dropdown_Task5_Task6 {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

       /* 1. Open Chrome browser
          2. Go to https://practice.cydeo.com/dropdown */
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void dropdown_task5() throws InterruptedException{

        /* Task #5: Select a state from State dropdown and verify result

        After having located the dropdown element, pass it into the constructor of Select object */
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        // 3. Select Illinois using visible text option
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");

        // 4. Select Virginia using value option
        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");

        // 5. Select California using index option
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);

        // 6. Verify final selected option is California.
        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText, expectedOptionText);
    }

    @Test
    public void dropdown_task6(){

        //Select “December 1 , 1923” and verify it is selected.
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        // Select year using visible text
        yearDropdown.selectByVisibleText("1923");

        // Select month using value attribute
        monthDropdown.selectByValue("11");

        // Select day using index number
        dayDropdown.selectByIndex(0);

        // Create expected values
        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "1";

        // Get actual values from browser
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        // Create assertions
        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertEquals(actualDay, expectedDay);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
