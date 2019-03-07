package com.selenium.steps;

import com.selenium.framework.ParentScenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class registerNewUser extends ParentScenario {

    @Given("^I Open the browser on \"([^\"]*)\"$")
    public void iOpenTheBrowserOn(String url)  {
            startBrowser();
            nativateTo(url);
    }

    @When("^I click on Sign Up Button$")
    public void iClickOnSignUpButton()  {
        mainPage.clickOnSignUp();
    }

    @And("^I enter the \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterTheAnd(String name, String email, String password)  {
        signUpPage.RegisterNewUser(name,email,password);
    }

    @And("^I click on Submit button$")
    public void iClickOnSubmitButton(){
        signUpPage.ClickOnSignUpBtn();
    }

    @Then("^A message confirmation should be displayed$")
    public void aMessageConfirmationShouldBeDisplayed() {
        assert(true);
    }

    @After
    public void cleanUp(){
        closeMobileDriver();
    }
}
