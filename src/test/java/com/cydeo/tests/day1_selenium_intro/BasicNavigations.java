package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // 1- Set up the browser driver
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of the chrome driver
        // this is the line opening an empty browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximizing the browser window size

        // 3- go to "https:// www.tesla.com"
        driver.get("https://www.tesla.com");

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //use selenium to refresh the page
        driver.navigate().refresh();

        Thread.sleep(2000);

        // use navigate().to():
        driver.navigate().to("https://www.google.com");

        //get thr title of the page
        System.out.println("driver.getTitle() = " + driver.getTitle());

        // get the current URL using selenium
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);



        driver.quit();




    }


}
