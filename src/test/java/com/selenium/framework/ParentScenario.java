package com.selenium.framework;

import com.selenium.page.*;
import com.selenium.steps.RegisterNewUserOnPetTinderSteps;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;

public class ParentScenario {
    private AppiumDriver driver;
    private WebDriver driver2;


    //Android / IOs Pages
    protected static CalculatorPage calculatorPage;
    protected static PetmatchLoginPage petmatchLoginPage;
    protected static HomePage homePage;
    protected  static AddPetPage addPetPage;
    protected static RegisterNewUserOnPetTinderPage registerNewUserOnPetTinderPage;


    //Web Pages
    protected static MainPage mainPage;
    protected static SignUpPage signUpPage;

    public void startBrowser(){
        //for Windows:
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\java\\resources\\drivers\\chromedriver.exe");

        //for Mac:
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/resources/drivers/chromedriver");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();

        try{
            driver2 = new ChromeDriver();
        }catch (Exception e){
            System.out.println("Excepcion al momento de inicializar el driver: " + e);
        }

        //instancias de las Paginas
        mainPage = new MainPage(driver);
        signUpPage = new SignUpPage(driver);

    }

    public void startAndroid(){
        String url = "http://localhost:4723/wd/hub";
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"7ce9908d");
        cap.setCapability(MobileCapabilityType.APP_PACKAGE,"com.automation.petmatch");
        cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.automation.petmatch.viewcontrollers.activities.OnboardingActivity");

        try{
            driver = new AndroidDriver<MobileElement>(new URL(url),cap);
        }catch (Exception e){
            System.out.println("Excepcion al momneto de generar el Driver " + e);
        }

        //instanciando pagiunas de android
        calculatorPage = new CalculatorPage(driver);
        petmatchLoginPage = new PetmatchLoginPage(driver);
        homePage = new HomePage(driver);
        addPetPage = new AddPetPage(driver);
        registerNewUserOnPetTinderPage = new RegisterNewUserOnPetTinderPage(driver);


    }

    protected void nativateTo (String url){
        driver2.navigate().to(url);
    }

    protected void closeWebDriver(){
        driver2.quit();
    }

    protected void closeMobileDriver(){
        driver.quit();
    }

}
