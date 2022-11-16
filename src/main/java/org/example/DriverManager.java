package org.example;

import org.openqa.selenium.chrome.ChromeDriver;


//DriverManager class uses all the different methods of Utils class like, click, sendkeys, get text etc
//Therefore, we have used inheritance using keyword extends
public class DriverManager extends Utils{


    //open browser method to initiate chrome driver and to open given URL
    public void openBrowser(){

        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");



    }

    //Method to close the browser
    public void closeBrowser()

    {
        driver.quit();  // to close the browser

    }



}
