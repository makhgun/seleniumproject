package com.cydeo.tests.day5_dynamicWebElements_TestNGIntro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T3_RadioButton_cont {

    public static void main(String[] args) {

//        1. Open Chrome browser
//        2. Go to https://practice.cydeo.com/radio_buttons
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/radio_buttons");

//        Locate name='sports' radio buttons and store them in a list of Web Element
        List<WebElement> sportRadioButtons = driver.findElements(By.name("sport"));

//        Loop through the list of Web Element and select matching result "hockey"

        for (WebElement each : sportRadioButtons) {

            String eachId = each.getAttribute("id");
            System.out.println("eachId = " + eachId);
            if (eachId.equals("hockey")) {
                each.click();
                System.out.println("Hockey is selected: " + each.isSelected());
                break;
            }

        }
        driver.quit();


    }


}
/*
Create a utility method to handle above logic.
Method name: clickAndVerifyRadioButton
Return type: void or boolean
Method args:
1. WebDriver
2. Name attribute as String (for providing which group of radio buttons)
3. Id attribute as String (for providing which radio button to be clicked)
Method should loop through the given group of radio buttons. When it finds the
matching option, it should click and verify option is Selected.
Print out verification: true
 */