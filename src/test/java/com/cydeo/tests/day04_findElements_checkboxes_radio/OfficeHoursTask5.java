package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class OfficeHoursTask5 {

    public static void main(String[] args) {

        /*
        TC:5 As a user I should be able to see the login page

        1-open a Chrome browser  */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2-goto https://vytrack.com/
        driver.get(" https://vytrack.com/");

        //3-click Login label

        WebElement LoginWebElement = driver.findElement(By.xpath("//*[@id='menu-item-849']/a"));

        //command + option + T

        try {


        } catch (Exception e) {
            e.printStackTrace();
        }


        //4-verify the url contains login
    }
}
