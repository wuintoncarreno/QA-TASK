package com.selenium.page;

import com.selenium.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.w3c.css.sac.ElementSelector;

public class CalculatorPage extends ParentPage {

    public CalculatorPage(AppiumDriver driver){
        super(driver);
    }

    By BNT_NUMBER   = By.id("com.android.calculator2:id/digit_");
    By BNT_OP_SUM     = By.id("com.android.calculator2:id/op_add");
    By BNT_OP_EQ      = By.id("com.android.calculator2:id/eq");
    By TXT_RESULT     = By.id("com.android.calculator2:id/result");

    public void clickOnOperatorSUM(){
        ClickOnLocator(BNT_OP_SUM);
    }

    public void clickOnOperatorEQ(){
        ClickOnLocator(BNT_OP_EQ);
    }

    public void clickOnNumber(String Number){
        clickElementByTextValue(BNT_NUMBER, Number);
    }

    public boolean getResult(String Number){
        boolean result = false;
        if (getTextOfTextField(TXT_RESULT).equals(Number))
            result = true;

        return result;
    }

}
