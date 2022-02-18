package com.cydeo.tests.day08_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class Task1_Task2_WebTable_OrderVerify {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {

        // 1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void WebTable() {

        // 3. Locate the cell that has Bob Martin text in it.
        WebElement bobMartinCell =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

        // System.out.println("bobMartingCell.getText() = " + bobMartinCell.getText());

        // 4. Verify that Bob Martin's name is listed as expected. Expected: Bob Martin.
        String expectedBobName = "Bob Martin";
        String actualBobName = bobMartinCell.getText();

        assertEquals(actualBobName, expectedBobName);

        // 5. Verify that Bob Martin's order date is as expected. Expected: 12/31/2021
        WebElement bobMartinDateCell =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']" +
                        "/following-sibling::td[3]"));

        String expectedBobDate = "12/31/2021";
        String actualBobDate = bobMartinDateCell.getText();

        assertEquals(actualBobDate, expectedBobDate);
    }

    @Test
    public void test2() {

        String customerOrderDate1 = WebTableUtilities.returnOrderDate(driver,"Alexandra Gray");
        /* Using WebTableUtilities() method that was created in utilities
           In addition to returnOrderDate, the method can be used to return other cell data: returnOrderName,
           returnPizzaType etc.  */

        System.out.println("customerOrderDate1 = " + customerOrderDate1);
    }

    @Test
    public void test3() {

        WebTableUtilities.orderVerify(driver, "Bart Fisher","01/16/2021");
    }

    @AfterMethod
    public void tearDown() {

        driver.close();
    }
}
