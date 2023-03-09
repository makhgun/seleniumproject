package com.cydeo.tests.day5_dynamicWebElements_TestNGIntro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_RadioButton {

    public static void main(String[] args) {

//        1. Open Chrome browser
//        2. Go to https://practice.cydeo.com/radio_buttons
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/radio_buttons");

//        3. Click to “Hockey” radio button
        WebElement hockeyBtn = driver.findElement(By.xpath("//*[@id='hockey']"));
        hockeyBtn.click();

//        4. Verify “Hockey” radio button is selected after clicking.
        System.out.println("hockeyBtn.isSelected() = " + hockeyBtn.isSelected());

        driver.quit();
    }

}
