package org.example;

import org.openqa.selenium.By;


//Inherited Utils class to use its methods
public class RegistrationCompletedConfirmation extends Utils{

    private String confirmationMessage; //Variable to store confirmation message

    //Method to capture registration completed method
    public void regCompleteMsg(){

        confirmationMessage = captureText(By.className("result"));
        System.out.println(confirmationMessage); //printing the message on console

    }
}
