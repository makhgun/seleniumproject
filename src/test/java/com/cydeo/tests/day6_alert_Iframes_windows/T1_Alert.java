package com.cydeo.tests.day6_alert_Iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Alert {

    @Test
    public void jsAlert() {
//        1. Open browser
//        2. Go to website: http://practice.cydeo.com/javascript_alerts
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/javascript_alerts");

//        3. Click to “Click for JS Alert” button
        WebElement jsAlertBtn = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlertBtn.click();

//        4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

//        5. Verify “You successfully clicked an alert” text is displayed.
        WebElement finalMsg = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(finalMsg.isDisplayed());

    }

}
/*
TC #1: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfully clicked an alert” text is displayed.
 */
