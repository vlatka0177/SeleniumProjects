package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Checkboxes {

    public static void main(String[] args) {

        /* 1. Open a Chrome browser                                                    */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 2. Go to https://practice.cydeo.com/checkboxes
        driver.get("https://practice.cydeo.com/checkboxes");

        // 3. Confirm that checkbox #3 is not selected by default.
/*
        // 3. Confirm checkbox #2 is selected by default.
        System.out.println("checkbox2.isSelected(), expecting = true " + checkbox2.isSeleced);

        // 5. Click checkbox #2 to deselect it.
        Thread.sleep(2000);
        checkbox2.click();*/

    }
}
