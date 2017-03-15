package com.TestNg;

import org.junit.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.*;

/**
 * Created by macbook on 3/15/17.
 */
public class PracticeTestng {

    @BeforeTest
    public void SetUpTest(){
        System.out.println("before test");
    }
    @AfterTest
    public void tearDownTest(){
        System.out.println("after test");
    }
    @Test
    public void loginTest(){
        System.out.println("test");

    }
    @BeforeClass
    public  void SetUpClass(){
        System.out.println("before class");
    }
    @AfterClass
    public  void tearDowClass(){
        System.out.println("after class");
    }
    @BeforeSuite
    public  void SetUpSuit(){
        System.out.println("before suite");

    }
    @AfterSuite
    public  void  tearDownSuit(){
        System.out.println("after suite");

    }





}
