package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1_Circle_DragAndDrop {

    @Test
    public void drag_and_drop_test() {

        /*
        Task #1: Drag and drop

        1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index */
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        // Locate

        // Locate small and big circles to be able to drag them around
        WebElement smallCircle = Driver.getDriver().findElement((By.id("draggable")));
        WebElement bigCircle = Driver.getDriver().findElement((By.id("droptarget")));

        // 2. Drag and drop the small circle to bigger circle.
        Actions actions = new Actions(Driver.getDriver());
        // actions.dragAndDrop(smallCircle, bigCircle).perform();
        actions.clickAndHold(smallCircle).moveToElement(bigCircle).release().perform();

        // 3. Assert.
        // Text in big circle changed to: “You did great!”
        String actualBigCircleText = bigCircle.getText();
        String expectedBigCircleText = "You did great!";

        Assert.assertEquals(actualBigCircleText, expectedBigCircleText);

    }
}
