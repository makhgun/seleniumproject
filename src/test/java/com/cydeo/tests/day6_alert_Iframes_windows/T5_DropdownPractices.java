package com.cydeo.tests.day6_alert_Iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_DropdownPractices {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void dropDownTask() throws InterruptedException {

//        1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement listState = driver.findElement(By.xpath("//select[@id='state']"));

        Select list = new Select(listState);
//        3. Select Illinois
        list.selectByValue("IL");
        Thread.sleep(2000);
//        4. Select Virginia
        list.selectByVisibleText("Virginia");
        Thread.sleep(2000);

//        5. Select California
        list.selectByIndex(5);
//        6. Verify final selected option is California.
//        Use all Select options. (visible text, value, index)
        String expectedOption = "California";
        String actualOption = list.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOption,expectedOption);
        Thread.sleep(2000);

        driver.quit();

    }

}
