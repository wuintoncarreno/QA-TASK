package com.selenium.page;

import com.selenium.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends ParentPage {

    public MainPage(AppiumDriver driver){
        super(driver);
    }

    By SIGN_UP_OPTION = By.
            linkText("Sign Up");

    public void clickOnSignUp(){
        ClickOnLocator(SIGN_UP_OPTION);
    }



}
