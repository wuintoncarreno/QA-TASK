package com.selenium.framework;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

public abstract class ParentPage extends DSL{

    public ParentPage(AppiumDriver driver){
        super(driver);
    }
}
