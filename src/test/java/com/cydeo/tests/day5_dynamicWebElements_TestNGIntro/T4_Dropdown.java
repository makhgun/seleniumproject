package com.cydeo.tests.day5_dynamicWebElements_TestNGIntro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T4_Dropdown {

    WebDriver driver;

    //1. Open Chrome browser
    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //  2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void simpleDropDown() {

//        3. Verify “Simple dropdown” default selected value is correct
//        Expected: “Please select an option”
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentlySelectedOption =  simpleDropdown.getFirstSelectedOption();

        Assert.assertEquals(currentlySelectedOption.getText(),"Please select an option");

    }


    @Test
    public void stateSelection() {

//      4. Verify “State selection” default selected value is correct
//      Expected: “Select a State”
        Select stateSelection = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        WebElement defaultOption = stateSelection.getFirstSelectedOption();

        String actualDefaultOption = defaultOption.getText();
        String expectedDefaultOption = "Select a State";

        Assert.assertEquals(actualDefaultOption,expectedDefaultOption);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
/*
TC#4: Verifying “Simple dropdown” and “State selection” dropdown
default values
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”
 */