package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {


    //declaration of object for driver manager method
    DriverManager driverManager = new DriverManager();


    //before method - testNG method to run before any Test
    @BeforeMethod
    public void setUp(){

        //calling open browser method from driver manager class using object
        driverManager.openBrowser();

    }

    //After method - testNG method to run at the end of the Test method
    @AfterMethod
    public void tearDown(){

        //calling close browser method using object of Drivermanager class
        driverManager.closeBrowser();
    }

}
