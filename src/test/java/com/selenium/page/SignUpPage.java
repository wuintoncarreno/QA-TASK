package com.selenium.page;

import com.selenium.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends ParentPage {
    public SignUpPage(AppiumDriver driver){
        super(driver);
    }
    By TXT_NAME_INPUT = By.name("Name");
    By TXT_EMAIL_INPUT = By.name("Email");
    By TXT_PASSWORD_INPUT = By.name("Password");
    By BTN_SIGN_UP = By.className("primary");


    public void RegisterNewUser(String name, String email, String password){

        TypeInTextField(TXT_NAME_INPUT, name );
        TypeInTextField(TXT_EMAIL_INPUT, email );
        TypeInTextField(TXT_PASSWORD_INPUT, password );
    }

    public void ClickOnSignUpBtn (){
        ClickOnLocator(BTN_SIGN_UP);
    }


}
