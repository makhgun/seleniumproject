package com.cydeo.tests.day6_alert_Iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T6_DropdownPractice_2 {


    @Test
    public void taskSix() {
//        1. Open Chrome browser
//        2. Go to https://practice.cydeo.com/dropdown
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/dropdown");

//        3. Select “December 1st, 1923” and verify it is selected.
//                Select year using : visible text
        Select yearDrp = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        yearDrp.selectByVisibleText("1924");

//        3. Select “December 1st, 1923” and verify it is selected.
//        Select month using : value attribute
        Select monthDrp = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthDrp.selectByValue("11");

//        3. Select “December 1st, 1923” and verify it is selected.
//        Select day using : index number
        Select dayDrp = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dayDrp.selectByIndex(0);

        Assert.assertEquals(yearDrp.getFirstSelectedOption().getText(),"1924");
        Assert.assertEquals(monthDrp.getFirstSelectedOption().getText(),"December");
        Assert.assertEquals(dayDrp.getFirstSelectedOption().getText(),"1");


    }

}


