package com.cydeo.tests.day6_alert_Iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_IframeTask {

    @Test
    public void iFrameTask(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/iframe");

        WebElement iframe = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);

        WebElement defaultMsg = driver.findElement(By.xpath("//body[@id='tinymce']"));
        System.out.println("defaultMsg= " + defaultMsg.getText());
        Assert.assertTrue(defaultMsg.isDisplayed());

        driver.switchTo().parentFrame();
        WebElement bigMsg = driver.findElement(By.xpath("//div[@class='example']"));
        System.out.println("bigMsg = " + bigMsg.getText());
        Assert.assertTrue(bigMsg.isDisplayed());
    }

}
/*
TC #4: Iframe practice
1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */