package org.example;



import com.sun.org.apache.bcel.internal.generic.PUSH;
import org.openqa.selenium.By;
import org.testng.Assert;


//Class HomePage is child class and Utils is parent class - Java Inheritance
public class HomePage extends Utils{


    //this method is to verify is user is on the homepage or not
    //We have used Assert method with the function equal and verified it classname
    public void verifyRegisterButtonPresent(){

        Assert.assertEquals(captureText(By.className("ico-register")), "Register", "Register button not present");
      //  Assert.assertEquals(captureText(By.linkText("Register")), "register", "Register button not present");

    }

    //click on Registration button after verifying that the user is on Register page
    public void clickOnRegisterPage(){

        clickOnElement(By.linkText("Register"));
    }

}
