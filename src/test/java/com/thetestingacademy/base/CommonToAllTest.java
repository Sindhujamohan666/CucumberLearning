package com.thetestingacademy.base;

import com.thetestingacademy.driver.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class CommonToAllTest {
    @BeforeTest
    public void setup(){
        DriverManager.init();
    }
    @AfterTest
    public void teardown(){
      DriverManager.down();
    }

}
