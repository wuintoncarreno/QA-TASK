package com.selenium.page;

import com.selenium.framework.ParentPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class AddPetPage  extends ParentPage {
    public AddPetPage (AppiumDriver driver){
        super(driver);
    }

    By BTN_ALLOW = By.id("com.android.packageinstaller:id/permission_allow_button");
    By TXT_NAME = By.id("com.automation.petmatch:id/nameEditText");
    By SPN_GEN=By.id("com.automation.petmatch:id/genreSpinner");
    By XPATH_GEN= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
    By SPN_TYPE=By.id("com.automation.petmatch:id/typeSpinner");
    By XPATH_TYPE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
    By TXT_BIRTH=By.id("com.automation.petmatch:id/birthDateEditText");
    By TXT_DESCRIBE=By.id("com.automation.petmatch:id/aboutEditText");
    By BTN_CHOOSE=By.id("com.automation.petmatch:id/buttonChoose");
    By XPATH_PHOTO = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ImageView[1]");
    By BTN_CREATE = By.id("com.automation.petmatch:id/saveButton");

    public void clickOnButtonAllow(){
        handlingWaitToElement(BTN_ALLOW);
        ClickOnLocator(BTN_ALLOW);
    }

    public void inputName(String name){
        handlingWaitToElement(TXT_NAME);
        TypeInTextField(TXT_NAME, name );
    }
    public void clickOnSpinnerGen(){ClickOnLocator(SPN_GEN);}
    public void clickOnPathGen(){
        ClickOnLocator(XPATH_GEN);
    }
    public void clickOnSpinnerType(){
        ClickOnLocator(SPN_TYPE);
    }
    public void clickOnPathType(){
        ClickOnLocator(XPATH_TYPE);
    }
    public void inputBirth(String birth){
        TypeInTextField(TXT_BIRTH, birth );
    }
    public void inputDescribe(String describe){
        TypeInTextField(TXT_DESCRIBE, describe );
    }
    public void clickOnChoose(){
        ClickOnLocator(BTN_CHOOSE);
    }
    public void clickOnPathPhoto(){handlingWaitToElement(XPATH_PHOTO);ClickOnLocator(XPATH_PHOTO); }
    public void clickOnBtnCreate(){handlingWaitToElement(BTN_CREATE);ClickOnLocator(BTN_CREATE);  }

}
