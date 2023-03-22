package com.cydeo.utilities;

/*
In this class only general utility methods that are not related to some specific page
 */

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {
    /*
    This method will accept int (in second) and execute Thread.sleep for given duration
     */
    public static void sleep (int second){
        second *= 1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }


    /*
    TC #2: Create utility method
1. Create a new class called BrowserUtils
2. Create a method to make Task1 logic re-usable
3. When method is called, it should switch window and verify title.
Method info:
• Name: switchWindowAndVerify
• Return type: void
• Arg1: WebDriver
• Arg2: String expectedInUrl
• Arg3: String expectedTitle
     */

    public static void switchWindowAndVerify (WebDriver driver , String expectedInUrl , String expectedInTitle){

        Set<String> allWindowsHandles = driver.getWindowHandles();
        for (String each : allWindowsHandles) {

            driver.switchTo().window(each);

            System.out.println("Current URL: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }

        }

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));



    }





}
