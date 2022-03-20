package com.cydeo.tests.day12;

import com.cydeo.pages.DynamicLoadPage1;
import com.cydeo.pages.DynamicLoadPage7;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverWaitPractices {

    @Test
    public void dynamic_load_page_7_test() {

        // 1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        /* 2. Wait until title is “Dynamic title”
              Create the wait object. */
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        // Use the "wait" object to create the expected condition for wait
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        // If the condition is not met, throws TimeOutException

        // Create an object of DynamicLoadPage7 to reach and assert web elements
        DynamicLoadPage7 dynamicLoadPage7 = new DynamicLoadPage7();

        // 3. Assert: Message “Done” is displayed.
        Assert.assertTrue(dynamicLoadPage7.doneMessage.isDisplayed());

        //4. Assert: Image is displayed
        Assert.assertTrue((dynamicLoadPage7.spongeBobImage.isDisplayed()));
    }

    @Test
    public void dynamic_load_page_1_test(){
        //1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        DynamicLoadPage1 dynamicLoadPage1 = new DynamicLoadPage1();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        //2. Click to start
        dynamicLoadPage1.startButton.click();

        //3. Wait until loading bar disappears
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoadPage1.loadingBar));

        //4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicLoadPage1.inputUsername.isDisplayed());

        //5. Enter username: tomsmith
        dynamicLoadPage1.inputUsername.sendKeys("tomsmith");

        //6. Enter password: incorrectpassword
        dynamicLoadPage1.inputPassword.sendKeys("somethingwrong");

        //7. Click to Submit button
        dynamicLoadPage1.submitButton.click();

        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(dynamicLoadPage1.errorMessage.isDisplayed());
    }
}
