package com.cydeo.tests.day6_alert_Iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T5_WindowTask {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }

    @Test
    public void windowTask(){
//        3. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");

//        4. Assert: Title is “Windows”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";

        Assert.assertEquals(actualTitle,expectedTitle);

//        5. Click to: “Click Here” link
        WebElement clickBtn = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickBtn.click();


//        6. Switch to new Window.
//        7. Assert: Title is “New Window”

        for(String each: driver.getWindowHandles()){

            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: " + driver.getTitle());

        }

        String secondTabId = driver.getWindowHandle();
        System.out.println("secondTabId = " + secondTabId);


        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "New Window";

        Assert.assertEquals(actualTitle2,expectedTitle2);



    }


}

/*
TC #5: Window Handle practice
1. Create a new class called: T5_WindowsPractice
2. Create new test and make set ups
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”
 */
