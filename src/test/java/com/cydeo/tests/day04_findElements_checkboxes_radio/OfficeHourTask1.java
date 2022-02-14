package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfficeHourTask1 {

    public static void main(String[] args) {

    /*
    TC:1 As a user I should be able to see Home is displayed

        1. Open a Chrome browser */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");
        // driver.navigate().to("https://vytrack.com/");

        //3-verify Home is displayed
        //Right-click on the web page + inspect
        // Place inspect on Home and the element will be highlighted in the code
        // command + F will open find by string selector or xpath box
        // Right-click on the highlighted element + copy + xpath
        // paste xpath in the find box. 2 of 2 appears in the left corner of the box
        // WebElement homeWebElement = driver.findElement(By.xpath("//ul[@id='top-menu']/li[1]/a"));
        WebElement homeWebElement = driver.findElement(By.xpath("//*[@id='menu-item-844']/a"));
        // After copy and paste from the box, change \" slash inverted commas to single commas in square brackets
        // Add inverted commas inside the braces
        // * means any element tag here

        if (homeWebElement.isDisplayed()){
            System.out.println("Home verification PASSED.");
        }else {
            System.err.println("Home verification FAILED.");
        }
    }
}
