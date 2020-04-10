package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Jay
 */
public class CustomerLoginPage extends Utility {

    By yourName = By.id("userSelect");
    By loginBtn = By.xpath("//button[@class='btn btn-default']");
    By yourNameLabel = By.xpath("//div[@class='form-group']//label");

    public void selectYourName(String name){
        selectByVisibleTextFromDropDown(yourName, name);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginBtn);
    }

    public boolean isYourNameLabelDisplayed(){
        if (getElement(yourNameLabel).isDisplayed()){
            return true;
        }else {
            return false;
        }
    }

}
