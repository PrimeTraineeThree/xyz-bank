package com.bank.testbase;

import com.bank.browserselector.BrowserSelector;
import com.bank.utility.Utility;
import org.openqa.selenium.Point;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Jay
 */
public class TestBase extends Utility {

    BrowserSelector browserSelector = new BrowserSelector();
    String baseUrl = "http://www.way2automation.com/angularjs-protractor/banking/#/login";

    @BeforeMethod
    public void openBrowser(){
        browserSelector.selectBrowser("ie");
        driver.manage().window().setPosition(new Point(-2000, 0));//display into second screen
        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}
