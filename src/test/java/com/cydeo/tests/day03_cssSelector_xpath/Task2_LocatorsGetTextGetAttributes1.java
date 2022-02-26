package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2_LocatorsGetTextGetAttributes1 {

    public static void main(String[] args) {

        /*
        Task #2: NextBaseCRM, locators, getText(), getAttribute() practice

        Inspect and decide which locator you should be using to locate web elements.

        1. Open a Chrome browser                          */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

       // 2. Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        /*3. Verify “remember me” label text is as expected:
        Expected: Remember me on this computer
                                                                  Copy and paste from the web page */
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        if (actualRememberMeLabel.equals(expectedRememberMeLabel)) {
            System.out.println("Label verification PASSED.");
        }else {
            System.out.println("Label verification FAILED.");
        }

        /*4. Verify “forgot password” link text is as expected:
        Expected: Forgot your password?                     */
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPasswordLinkText = "Forgot your password?";
        String actualForgotPasswordLinkText = forgotPasswordLink.getText();

        if (actualForgotPasswordLinkText.equals(expectedForgotPasswordLinkText)) {
            System.out.println("Forgot password link verification PASSED.");
        }else {
            System.out.println("actualForgotPasswordLinkText = " + actualForgotPasswordLinkText);
            System.out.println("expectedForgotPasswordLinkText = " + expectedForgotPasswordLinkText);

            System.out.println("Forgot password link verification FAILED");
        }

        /*5. Verify “forgot password” href attribute’s value contains expected:
        Expected: forgot_password=yes                        */

        String expectedInHref = "forgot_password=yes";
        String actualHrefAttributeValue = forgotPasswordLink.getAttribute("href");

        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);

        if (actualHrefAttributeValue.contains(expectedInHref)) {
            System.out.println("HREF attribute value verification PASSED.");
        }else{
            System.out.println("HREF attribute value verification FAILED.");
        }

        driver.close();
    }
}
