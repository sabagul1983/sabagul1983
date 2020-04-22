package com.test;

import com.test.drivers.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driversFactory=new DriverFactory();
    @Before
    public void openBrowser(){
        driversFactory.setUp();
        driversFactory.navigate("https://www.medicines.org.uk/emc/browse-companies");
        driversFactory.manage();
        driversFactory.putWait();
    }
//    @After
//    public void closeBrowser(){
//        driversFactory.close();
//   }
}


