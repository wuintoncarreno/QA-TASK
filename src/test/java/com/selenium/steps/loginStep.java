package com.selenium.steps;

import com.selenium.framework.DSL;
import com.selenium.framework.ParentScenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;


public class loginStep extends ParentScenario {



    @Given("^I am into LogIn page$")
    public void iAmIntoLogInPage() {
        startAndroid();
    }

    @When("^I type email \"([^\"]*)\"$")
    public void iTypeEmail(String email){
        petmatchLoginPage.inputEmail(email);
    }

    @And("^I type password \"([^\"]*)\"$")
    public void iTypePassword(String password) {
        petmatchLoginPage.inputPassword(password);
    }

    @And("^I click sign in Button$")
    public void iClickSignInButton() {
        petmatchLoginPage.clickOnButtonSignIn();
    }

    @When("^I click on sign in with google$")
    public void iClickSignInWithGoogle()  {

        petmatchLoginPage.clickOnButtonSignInGoogle(); }

    @Then("^HomePage should be showed$")
    public void homepageShouldBeShowed() {
        homePage.verifyThatelementsAreDisplayed();
        Assert.assertEquals(homePage.verifyTheTitlePage(),"PetMatch");
    }


    @And("^I click on Gooogle Account$")
    public void iClickOnGooogleAccount() {
        petmatchLoginPage.clickOnGoogleAccount();
    }

    @After
    public void cleanUp(){
        closeMobileDriver();
    }
}
