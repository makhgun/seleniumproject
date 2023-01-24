package com.cydeo.tests.day4_findElements_checkBox_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {

    public static void main(String[] args) {


//        1. Go to https://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");

//        2. Confirm checkbox #1 is NOT selected by default
        boolean result1 = driver.findElement(By.name("checkbox1")).isSelected();
        System.out.println("result1 expected false= " + result1);

//        3. Confirm checkbox #2 is SELECTED by default.
        boolean result2 = driver.findElement(By.name("checkbox2")).isSelected();
        System.out.println("result2 expected true= " + result2);

//        4. Click checkbox #1 to select it.
        driver.findElement(By.name("checkbox1")).click();
//        5. Click checkbox #2 to deselect it.
        driver.findElement(By.name("checkbox2")).click();
//        6. Confirm checkbox #1 is SELECTED.
        boolean result3 = driver.findElement(By.name("checkbox1")).isSelected();
        System.out.println("result3 expected true = " + result3);

//        7. Confirm checkbox #2 is NOT selected.
        boolean result4 = driver.findElement(By.name("checkbox2")).isSelected();
        System.out.println("result4 expected false= " + result4);

    }

}
