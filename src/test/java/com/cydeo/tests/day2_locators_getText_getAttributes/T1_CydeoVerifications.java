package com.cydeo.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        String url = driver.getCurrentUrl();
        if(url.contains("cydeo")){
            System.out.println("URL verified");
        }else {
            System.out.println("URL doesn't has \"cydeo\"");
        }

        String title = driver.getTitle();

        if (title.equals("Practice")){
            System.out.println("title confirmed");
        }else {
            System.out.println("title doesn't match \"Practice\"");
        }

        Thread.sleep(2000);
        driver.quit();

    }

}
