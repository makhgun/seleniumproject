package com.cydeo.tests.day5_dynamicWebElements_TestNGIntro;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupMethod(){
        System.out.println("--->BeforeClass is Running");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("--->AfterClass is Running");
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("-->BeforeMethod is running!");

    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("-->AfterMethod is running!");

    }


    @Test (priority = 1)
    public void test1() {
        System.out.println("Test1 is running..");

        //ASSERT EQUALS: compare 2 of same things
        Assert.assertEquals(1,2-1);
    }

    @Test (priority = 2)
    public void test2() {
        System.out.println("Test2 is running..");

        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected));
    }

}
