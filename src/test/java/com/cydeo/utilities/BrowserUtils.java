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
   This method accepts 3 arguments
• Arg1: WebDriver
• Arg2: String expectedInUrl
    -If condition matches, will break loop
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
//        5. Assert: Title contains “expectedInTitle”
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));



    }


//This method acceps a String "expectedTitle" and Asserts if it is true
     public static void verifyTitle(WebDriver driver , String expectedTitle){

        Assert.assertEquals(driver.getTitle() , expectedTitle);
    }



}
