package com.cydeo.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryTask {

    public static void main(String[] args) throws InterruptedException {

        // setting up chrome driver
        WebDriverManager.chromedriver().setup();

        // setting up instance of browser and maximizing window
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //going to URL given
        driver.get("http://library2.cybertekschool.com/login.html");

        // finding email input box and input email
        WebElement eMail = driver.findElement(By.id("inputEmail"));
        eMail.sendKeys("incorrect@email.com");

        // finding password input box and input password
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("incorrect password");

        // clicking log in
        WebElement loginButton = driver.findElement(By.className("btn"));
        loginButton.click();

        // allow selenium take time to error msg appear
        Thread.sleep(2000);

        String errorMsg = driver.findElement(By.className("alert")).getText();
        System.out.println("errorMsg = " + errorMsg);

        if(errorMsg.equals("Sorry, Wrong Email or Password")){
            System.out.println("Error msj display verified");
        }else {
            System.out.println("Error msg display failed!!");
        }

        Thread.sleep(2000);
       driver.quit();




    }

}
