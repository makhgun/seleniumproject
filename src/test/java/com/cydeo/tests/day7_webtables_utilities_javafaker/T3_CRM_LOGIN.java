package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN {

    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void crm_login_test(){//    TC #3: Login scenario

//2. Go to : http://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

//3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com ");

//4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");
      //  inputPassword.submit();

//5. Click to `Log In` button
        WebElement logInBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        logInBtn.click();

//6. Verify title is as expected:
        BrowserUtils.verifyTitle(driver,"My tasks");

//Expected: My tasks

//USERNAME                          PASSWORD
//helpdesk1@cybertekschool.com      UserUser
//Helpdesk2@cybertekschool.com      UserUser



    }

    @Test
    public void crm_login_test2(){//    TC #3: Login scenario

//2. Go to : http://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //calling my utility method to login helpdesk1
        CRM_Utilities.crm_login(driver);

//6. Verify title is as expected:
        BrowserUtils.verifyTitle(driver,"My tasks");

//Expected: My tasks




    }


    @Test
    public void crm_login_test3(){//    TC #3: Login scenario

//2. Go to : http://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //calling my utility method to login helpdesk1
        CRM_Utilities.crm_login(driver , "helpdesk1@cybertekschool.com" , "UserUser");

//6. Verify title is as expected:
        BrowserUtils.verifyTitle(driver,"My tasks");

//Expected: My tasks




    }


}
