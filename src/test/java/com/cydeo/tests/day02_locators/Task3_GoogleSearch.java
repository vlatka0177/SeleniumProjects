package com.cydeo.tests.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_GoogleSearch {

    public static void main(String[] args) {

        /* Task #3: Google Search

        1. Open a Chrome browser                                                     */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to: https://google.com
        driver.get("https://www.google.com");

        /* 3. Write "apple" in a search box.
           4. Press enter using Keys.ENTER                                             */
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER);

        /* 5. Verify the title.
              Expected: title should start with "apple" word                            */
        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification PASSED.");
        }else{
            System.out.println("Title verification FAILED.");
        }

        driver.close();
    }
}
