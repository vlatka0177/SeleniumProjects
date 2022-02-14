package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class OfficeHoursTask6 {

    public static void main(String[] args) {

        /*
        TC:6 As a user I should be able to see the password as "*******"



        //1-open a chrome browser */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");

        //3-click Login label
        // if 1 out of 2, not unique. modify css locator for login to make it unique

       // #menu-item-849 > a -> css,modify by adding a parent #top-menu>li#menu-item-849 > a
        driver.findElement(By.xpath("//*[@id='menu-item-849']/a")).click(); // -> xpath locator

        //4-enter username "User1"

        WebElement userNameWebElement = driver.findElement(By.xpath("//*[@id='login-form']/fieldset/div[1]/div[1]/label"));
        // WebElement userNameWebElement = driver.findElement(By.id("prependedInput"));
        userNameWebElement.sendKeys("User1");

        //5-enter password "UserUser123"

        //6-verify the password is hidden

    }
}
