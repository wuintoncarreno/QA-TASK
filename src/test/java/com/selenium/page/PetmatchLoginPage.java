package com.selenium.page;

import com.selenium.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class PetmatchLoginPage extends ParentPage {

    public PetmatchLoginPage(AppiumDriver driver){
        super(driver);
    }

    By TXT_EMAIL = By.id("com.automation.petmatch:id/emailEditText");
    By TXT_PASSWORD = By.id("com.automation.petmatch:id/passwordEditText");
    By BTN_SIGN_IN = By.id("com.automation.petmatch:id/signInButton");
    By BTN_SIGN_IN_GOOGLE =By.id("com.automation.petmatch:id/signInGoogleButton");
    By BTN_GOOGLE_ACCOUNT =By.id("com.google.android.gms:id/account_name");


    public void clickOnButtonSignIn(){ClickOnLocator(BTN_SIGN_IN);}

    public void clickOnButtonSignInGoogle(){
        handlingWaitToElement(BTN_SIGN_IN_GOOGLE);
        ClickOnLocator(BTN_SIGN_IN_GOOGLE);}

    public  void clickOnGoogleAccount(){
        handlingWaitToElement(BTN_GOOGLE_ACCOUNT);
        ClickOnLocator(BTN_GOOGLE_ACCOUNT);}


    public void inputEmail(String email){
        handlingWaitToElement(TXT_EMAIL);
        TypeInTextField(TXT_EMAIL, email );
    }
    public void inputPassword(String password){
        handlingWaitToElement(TXT_PASSWORD);
        TypeInTextField(TXT_PASSWORD,password);
    }
}
