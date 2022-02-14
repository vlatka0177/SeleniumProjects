package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfficeHoursTask2 {

    public static void main(String[] args) {

        /*
        TC:3 As a user I should be able to see Contact is displayed

        //1-open a Chrome browser */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");

        //3-verify Contact is displayed and label is "Contact"
        WebElement contactWebElement = driver.findElement(By.xpath("//*[@id='menu-item-855']/a"));

        if (contactWebElement.isDisplayed()) {
            System.out.println("Contact verification PASSED.");
        }else{
            System.out.println("Contact verification FAILED.");
        }
    }
}
