package com.cydeo.tests.day3_cssSelectorXpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        // expected: Log In
       // WebElement signInButton = driver.findElement(By.className("login-btn"));
                                                                    //tagName[attribute='value']
        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        String buttonText =  signInButton.getAttribute("value");
        String expectedButtonText = "Log In";

        if (buttonText.equals(expectedButtonText)){
            System.out.println("Button text verification PASSED!");
        }else {
            System.out.println("Button text verification FAILED!!!");
        }

        driver.quit();

    }

}
/*
TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In
PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */
