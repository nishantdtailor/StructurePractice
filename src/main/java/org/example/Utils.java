package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils extends BasePage{


    //click Method for reusability
    public void clickOnElement(By by){

        driver.findElement(by).click();
    }


    //SendText Method for reusability
    public void sendText(By by, String text) {
        driver.findElement(by).sendKeys(text);

    }

    //getText Method for reusability
    public String captureText(By by) {

        return driver.findElement(by).getText();

    }

    //timestamp method for reuasability
    public static String timeStamp() {

        return new SimpleDateFormat("yyyyDDHHmmss").format(new Date());
    }

    //selection from dropdown list by visible text method for reuasability
    public static void selectFromDropDownListByVisibleText(By by, String text) {

        Select selectText = new Select(driver.findElement(by));
        selectText.selectByVisibleText(text);
    }

    //selection from dropdown list by value method for reusability
    public static void selectFromDropDownByValue(By by, String value) {

        Select selectByValue = new Select(driver.findElement(by));
        selectByValue.selectByValue(value);
    }

    //selection from dropdown list by Index method for reusability
    public static void selectFromDropDownByIndex(By by, int index) {
        Select selectDropDown = new Select(driver.findElement(by));
        selectDropDown.selectByIndex(index);

    }

    //Webdriver wait method for webelement to be clickable for reusability
    public void waitForElementToBeClickable(By by, int timeInSeconds){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(by));


    }

    //Webdriver wait method for webelement to be visible for reusability
    public void waitForElementToBeVisible(By by, int duration1) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    //Webdriver wait method for URL to meet expected condition
    public void waitForUrlToBe(String url, int timeInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.urlToBe(url));
    }


}
