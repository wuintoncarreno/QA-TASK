package com.selenium.steps;

import com.selenium.framework.ParentScenario;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class RegisterNewUserOnPetTinderSteps extends ParentScenario {
    @Given("^I am into Log-In page$")
    public void iAmIntoLogInPage() {
        startAndroid();
    }

    @When("^I click on I dont have an account$")
    public void iClickOnIDontHaveAnAccount() {
        homePage.clickOnTxvRegister();
    }

    @And("^I type the user name \"([^\"]*)\"$")
    public void iTypeTheUserName(String username)  {
        registerNewUserOnPetTinderPage.inputUserName(username);
    }

    @And("^I type the user email \"([^\"]*)\"$")
    public void iTypeTheUserEmail(String useremail)  {
        registerNewUserOnPetTinderPage.inputUserEmail(useremail);
    }

    @And("^I type the user pass \"([^\"]*)\"$")
    public void iTypeTheUserPass(String userpass)  {
        registerNewUserOnPetTinderPage.inputUserPass(userpass);
    }

    @And("^I retype the user pass \"([^\"]*)\"$")
    public void iRetypeTheUserPass(String userpass2) {
        registerNewUserOnPetTinderPage.inputUserPass2(userpass2);
    }

    @And("^I click on Create Account$")
    public void iClickOnCreateAccount() {
        registerNewUserOnPetTinderPage.clickOnCreateAccount();

    }

    @Then("^HomePage should be showed for first time$")
    public void homepageShouldBeShowedForFirstTime() {
        homePage.verifyThatelementsAreDisplayed();
        Assert.assertEquals(homePage.verifyTheTitlePage(),"PetMatch");
    }
    @After
    public void cleanUp(){
        closeMobileDriver();
    }
}
