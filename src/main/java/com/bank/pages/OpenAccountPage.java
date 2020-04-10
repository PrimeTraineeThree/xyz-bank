package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Jay
 */
public class OpenAccountPage extends Utility {

    By customerName = By.xpath("//select[@id='userSelect']");
    By currency = By.xpath("//select[@id='currency']");
    By processBtn = By.xpath("//form[@name='myForm']//button");

    public void selectCustomerName(String cName){
        selectByVisibleTextFromDropDown(customerName, cName);
    }

    public void selectCurrency(String currency){
        selectByVisibleTextFromDropDown(this.currency, currency);
    }

    public void clickOnProcessButton(){
       clickOnElement(processBtn);
    }
}
