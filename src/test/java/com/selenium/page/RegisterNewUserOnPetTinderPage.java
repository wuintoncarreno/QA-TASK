package com.selenium.page;

import com.selenium.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class RegisterNewUserOnPetTinderPage extends ParentPage {
    public RegisterNewUserOnPetTinderPage(AppiumDriver driver){
        super(driver);
    }

    By ETX_USERNAME = By.id("com.automation.petmatch:id/nameEditText");
    By ETX_USEREMAIL = By.id("com.automation.petmatch:id/emailEditText");
    By ETX_USERPASS = By.id("com.automation.petmatch:id/passwordEditText");
    By ETX_USERPASS2 = By.id("com.automation.petmatch:id/passwordConfirmEditText");
    By BTN_CREATEACCOUN = By.id("com.automation.petmatch:id/registerButton");

    public void inputUserName(String username) {
        handlingWaitToElement(ETX_USERNAME);
        TypeInTextField(ETX_USERNAME,username);
    }
    public void inputUserEmail(String useremail) {
        TypeInTextField(ETX_USEREMAIL,useremail);
    }
    public void inputUserPass(String userpass) {
        TypeInTextField(ETX_USERPASS,userpass);
    }
    public void inputUserPass2(String userpass2) {
        TypeInTextField(ETX_USERPASS2,userpass2);
    }
    public void clickOnCreateAccount(){
        handlingWaitToElement(BTN_CREATEACCOUN);
        ClickOnLocator(BTN_CREATEACCOUN);}
}
