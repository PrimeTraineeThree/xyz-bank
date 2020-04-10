package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Jay
 */
public class CustomersPage extends Utility {

    By searchCustomer = By.xpath("//input[@placeholder='Search Customer']");
    By deleteBtn = By.xpath("//tr[@class='ng-scope']//td//button");

    public void searchCustomerByName(String name){
        sendTextToElement(searchCustomer, name);
    }

    public void deleteCustomer(){
        clickOnElement(deleteBtn);
    }
}
