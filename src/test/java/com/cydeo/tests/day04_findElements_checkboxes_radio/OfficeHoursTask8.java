package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class OfficeHoursTask8 {

    public static void main(String[] args) {

        /*
        TC:8 As a user I should be able to see the password by using eye icon

        //1-open a chrome browser  */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2-goto https://app.seamlessly.net/index.php/login
        driver.get("https://app.seamlessly.net/index.php/login");

        //3-enter password "UserUser123"
        WebElement passwordWebElement = driver.findElement(By.cssSelector("#prependedInput2"));
        passwordWebElement.sendKeys("UserUser123");

        //4-verify password as "*****"
        // eye icon un-hides the password when typed
        // right click + inspector on eye icon


        //5-click eye icon
        driver.findElement(By.xpath("//*[@id='body-login']/div/div/main/div/div/form/fieldset/p[2]/a/img"));


        //6-verify that password is shown

    }

}
