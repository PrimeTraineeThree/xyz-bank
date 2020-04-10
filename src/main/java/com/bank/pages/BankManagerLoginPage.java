package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Jay
 */
public class BankManagerLoginPage extends Utility {

    By addCustomerTab = By.xpath("//body[@class='ng-scope']//div[@class='ng-scope']//div[@class='ng-scope']//button[1]");
    By openAccountTab = By.xpath("//body[@class='ng-scope']//div[@class='ng-scope']//div[@class='ng-scope']//button[2]");
    By customersTab = By.xpath("//button[3]");

    public void clickOnAddCustomerTab(){
        clickOnElement(addCustomerTab);
    }

    public void clickOnOpenAccountTab(){
        clickOnElement(openAccountTab);
    }

    public void clickOnCustomerTab(){
        clickOnElement(customersTab);
    }
}
