package com.cydeo.tests.day3_cssSelectorXpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {

    public static void main(String[] args) {

        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com");

        //3- input "incorrect" to login box
        driver.findElement(By.name("USER_LOGIN")).sendKeys("incorrect");

        //4- input "incorrect" to password box
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("incorrect");

        //5- locating click button and click
        driver.findElement(By.className("login-btn")).click();

        //6- locating error msg and assigning to a string
        String actualMsg = driver.findElement(By.className("errortext")).getText();
        String expectedMsg = "Incorrect login or password";

        if (expectedMsg.equals(actualMsg)){
            System.out.println("Error msg verified as " + "\""+expectedMsg+"\"");
        }else {
            System.out.println("Error msg verification failed, actual msg is: "+ actualMsg);
        }

        driver.quit();

    }

}
/*
TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to log in button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
PS: Inspect and decide which locator you should be using to locate web
elements.
 */
