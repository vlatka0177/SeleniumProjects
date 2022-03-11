package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtilities;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task2 {

/* Task #2 Upload Test

    3. Upload the file.
    4. Assert:
            -File uploaded text is displayed on the page */

    @Test
    public void upload_test() {

        //  1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        // 2. Find some small file from your computer, and get the path of it.
        String path = "/Users/vlatkapersin/Desktop/Screen Shot 2022-03-08 at 13.11.38.png";

        // 3. Upload the file.
        WebElement  fileUpload = Driver.getDriver().findElement(By.id("file-upload"));

        BrowserUtilities.sleep(2);
        fileUpload.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));

    }
}
