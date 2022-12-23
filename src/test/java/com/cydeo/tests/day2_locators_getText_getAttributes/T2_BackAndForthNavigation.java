package com.cydeo.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_BackAndForthNavigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        // click to A/B Testing from the top of the list
        driver.findElement(By.linkText("A/B Testing")).click();

        String title = driver.getTitle();
        if(title.equals("No A/B Test")){
            System.out.println("TITLE VERIFIED AS: \"No A/B Test\" ");
        }else {
            System.out.println("TITLE VERIFICATION FAILED");
        }

        driver.navigate().back();

        title = driver.getTitle();

        if(title.equals("Practice")){
            System.out.println("TITLE VERIFIED AS: \"Practice\"");
        }else {
            System.out.println("TITLE VERIFICATION FAILED");
        }

        Thread.sleep(2000);
        driver.quit();


    }
}
