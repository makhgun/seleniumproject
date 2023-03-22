package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {


//    Method #2 info:
//• Name: login_crm()
//• Return type: void
//• Arg1: WebDriver
//• Arg2: String username
//• Arg3: String password

    //This method will log in with helpdesk1@cybertekschool.com user when it is called
    public static void crm_login(WebDriver driver) {
//    Method #1 info:
//            • Name: crm_login()
//• Return type: void
//• Arg1: WebDriver

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
//3. Enter valid username
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

//4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");
        //  inputPassword.submit();

//5. Click to `Log In` button
        WebElement logInBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        logInBtn.click();


    }

    public static void crm_login(WebDriver driver,String username , String password) {
//    Method #2 info:
//• Name: login_crm()
//• Return type: void
//• Arg1: WebDriver
//• Arg2: String username
//• Arg3: String password

        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
//3. Enter valid username
        inputUsername.sendKeys(username);

//4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(password);
        //  inputPassword.submit();

//5. Click to `Log In` button
        WebElement logInBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        logInBtn.click();


    }


}
