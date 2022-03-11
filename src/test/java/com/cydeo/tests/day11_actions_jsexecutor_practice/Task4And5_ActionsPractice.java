package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Task4And5_ActionsPractice {

    // Task #4: Scroll practice

    @Test
    public void task_4_and_5_test() {
        /* 1- Open  a Chrome browser
           2 - Go to:https://practice.cydeo.com/ */
        Driver.getDriver().get("https://practice.cydeo.com/");

        /* 3- Scroll down to “Powered by CYDEO”
              Create an Actions Class object. Pass 'driver' instance. */
        Actions actions = new Actions(Driver.getDriver());

        /* Locate Cydeo link to pass the Actions Method
           a[@href='https://cydeo.com/'] */
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        // 4- Scroll using Actions Class's “moveTo(element)” method
        actions.moveToElement(cydeoLink).perform();


    /*Task #5: Scroll practice 2
    1- Continue from where the Task 4 is left in the same test.
    2- Scroll back up to “Home” link using PageUP button */
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();

    }
}
