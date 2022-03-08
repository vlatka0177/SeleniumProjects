package com.cydeo.tests.day07_webtables_utilities;

import com.cydeo.utilities.BrowserUtilities;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task3_CRM_Login {

    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

        // 1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void crm_login_test() {

        // 2. Go to : https://login1.nextbasecrm.com/
        driver.get(" https://login1.nextbasecrm.com/");

        //3. Enter valid username
        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk1@cybertekschool.com");

        //helpdesk1@cybertekschool.com  UserUser
        //Helpdesk2@cybertekschool.com  UserUser

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //5. Click to Log In button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        //6. Verify title is as expected. Expected: (1) Portal
        BrowserUtilities.verifyTitle(driver, "(1) Portal");
    }

    @Test
    public void crm_login_test_2(){

        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        // Calling my utility method to login helpdesk1
        CRM_Utilities.crm_login(driver);

        //6. Verify title is as expected. Expected: (1) Portal
        BrowserUtilities.verifyTitle(driver, "(1) Portal");
    }

    @Test
    public void crm_login_test_3(){

        //2. Go to : https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //Calling my utility method to login helpdesk
        CRM_Utilities.crm_login(driver, "helpdesk2@cybertekschool.com", "UserUser" );

        //6. Verify title is as expected. Expected: (3) Portal
        //BrowserUtils.sleep(2);
        BrowserUtilities.verifyTitle(driver, "(3) Portal");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
