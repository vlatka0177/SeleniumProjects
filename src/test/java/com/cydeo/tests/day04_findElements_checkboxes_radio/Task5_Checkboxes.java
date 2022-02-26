package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task5_Checkboxes {

    public static void main(String[] args) throws InterruptedException {

        // 1. Open a Chrome browser                                                    */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 2. Go to https://practice.cydeo.com/checkboxes
        driver.get("https://practice.cydeo.com/checkboxes");

        // Locate checkboxes
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        // 3. Confirm checkbox #1 is NOT selected by default.
        System.out.println("checkbox1.isSelected(), expecting false = " + checkbox1.isSelected());

        // 4. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkbox2.isSelected(), expecting true = " + checkbox2.isSelected());

        // 5. Click checkbox #1 to select it.
        Thread.sleep(2000);
        checkbox1.click();

        // 6. Click checkbox #2 to deselect it.
        Thread.sleep(2000);
        checkbox2.click();

        // 7. Confirm checkbox #1 is SELECTED.
        System.out.println("checkbox1.isSelected(), expecting true = " + checkbox1.isSelected());

       /* if(checkbox1.isSelected()){
            System.out.println("verification passed");
          }else{
            System.out.println("verification fail");
          }  */

        // 8. Confirm checkbox #2 is NOT selected.
        System.out.println("checkbox2.isSelected(), expecting false = " + checkbox2.isSelected());

        /* if(!checkbox2.isSelected()){
                System.out.println("verification passed");
           }else{
                System.out.println("verification fail");
        } */

        driver.close();
    }
}
