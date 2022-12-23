package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {
        // TC #1: Yahoo Title Verification
        // do set up for browser driver
        WebDriverManager.chromedriver().setup();

        // 1. Open Chrome Browser
        WebDriver driver = new ChromeDriver();

        //2. Maximizing window
        driver.manage().window().maximize();

        //3. Gets URL "https://www.yahoo.com"
        driver.get("https://www.yahoo.com");

        //4. Gets title and assign to a string variable
        String title = driver.getTitle();

        // if condition for confirming the title and the expected result
        if (title.contains("Yahoo")){
            System.out.println("title confirmed");
        }else {
            System.out.println("title does not match, expected result: \"Yahoo\"");
            System.out.println("Actual result = " + title);
        }

        Thread.sleep(2000);
        driver.quit();


    }

}
