package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Jay
 */
public class AccountPage extends Utility {

    By logOutBtn = By.xpath("//button[@class='btn logout']");
    By transactionTab = By.xpath("//body[@class='ng-scope']//div[@class='ng-scope']//div[@class='ng-scope']//button[1]");
    By depositTab = By.xpath("//body[@class='ng-scope']//div[@class='ng-scope']//div[@class='ng-scope']//button[2]");
    By withdrawlTab = By.xpath("//button[3]");
    By amount = By.xpath("//input[@placeholder='amount']");
    By depositWithdrawBtn = By.xpath("//button[@class='btn btn-default']");
    By errorMessage = By.xpath("//span[@class='error ng-binding']");

    public void clickOnLogoutButton(){
        clickOnElement(logOutBtn);
    }

    public boolean isLogoutButtonDisplayed(){
        if (getElement(logOutBtn).isDisplayed()){
            return true;
        }else {
            return false;
        }
    }

    public void clickOnTransactionTab(){
        clickOnElement(transactionTab);
    }

    public void clickOnDepositTab(){
        clickOnElement(depositTab);
    }

    public void clickOnWithdrawlTab(){
        clickOnElement(withdrawlTab);
    }

    public void enterAmount(int amount){
        sendTextToElement(this.amount, String.valueOf(amount));
    }

    public void clickOnDepositWithdrawButton(){
        clickOnElement(depositWithdrawBtn);
    }

    public String getErrorSuccessMessage(){
        return getTextFromElement(errorMessage);
    }



}
