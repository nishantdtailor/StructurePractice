package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{


    HomePage homePage = new HomePage(); //object creation to use methods from homepage class
    RegistrationPage registrationPage = new RegistrationPage(); // object creation to use methods from registration page class
    RegistrationCompletedConfirmation registrationCompletedConfirmation= new RegistrationCompletedConfirmation();
    //registration confirmation class object created to call that method below

@Test
    public void verifyRegistrationButtonPresentOnHomepage(){
    homePage.verifyRegisterButtonPresent();
    //method from home page called for verification of registration page


    }

@Test
public void clickRegisterButton(){
        homePage.clickOnRegisterPage();
        //calling of method to click on Registration page

        registrationPage.enterRegistrationInfo();
        //calling of method for entering registration info on registration page

        registrationCompletedConfirmation.regCompleteMsg();
        //method for printing reg completed message
    }





}
