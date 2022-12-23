package com.cydeo.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        WebElement agreeButton =  driver.findElement(By.id("L2AGLb"));
        agreeButton.click();

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple" + Keys.ENTER);

        String title = driver.getTitle();

        if(title.startsWith("apple")){
            System.out.println("TITLE 1ST WORD VERIFIED AS: \"apple\"");
        }else {
            System.out.println("TITLE VERIFICATION FAILED");
        }

        Thread.sleep(2000);
        driver.quit();







    }
}
