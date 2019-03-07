package com.selenium.steps;

import com.selenium.framework.ParentScenario;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class createPetSteps extends ParentScenario {
    @Given("^I am into LogIn page, loging with google, home page showed$")
    public void iAmIntoLogInPageLogingWithGoogleHomePageShowed() {
        startAndroid();
        petmatchLoginPage.clickOnButtonSignInGoogle();
        petmatchLoginPage.clickOnGoogleAccount();
    }

    @When("^I click on Add Button$")
    public void iClickOnAddButton() {
        homePage.clickOnButtonAdd();
    }
    @And("^I click on Allow Button$")
    public void iClickOnAllowButton() {
        addPetPage.clickOnButtonAllow();
        homePage.refreshPageAfterPermission();
        homePage.clickOnButtonAdd();
    }

    @And("^I type the name \"([^\"]*)\"$")
    public void iTypeTheName(String name) {
        addPetPage.inputName(name);
    }

    @And("^I click on Spinner Gender$")
    public void iClickOnSpinnerGender() {
        addPetPage.clickOnSpinnerGen();
    }

    @And("^I clck on Male$")
    public void iClckOnMale() {
        addPetPage.clickOnPathGen();
    }

    @And("^I click on Spinner Type$")
    public void iClickOnSpinnerType() {
        addPetPage.clickOnSpinnerType();

    }

    @And("^I click on Cat$")
    public void iClickOnCat() {
    addPetPage.clickOnPathType();
    }

    @And("^I type the date \"([^\"]*)\"$")
    public void iTypeTheDate(String birth){
        addPetPage.inputBirth(birth);
    }

    @And("^I type the describe \"([^\"]*)\"$")
    public void iTypeTheDescribe(String describe){
        addPetPage.inputDescribe(describe);
    }

    @And("^I click on Choose Buttom$")
    public void iClickOnChooseButtom() {
        addPetPage.clickOnChoose();
    }

    @And("^I click on Img$")
    public void iClickOnImg() {
        addPetPage.clickOnPathPhoto();
    }

    @And("^I click on Create Button$")
    public void iClickOnCreateButton() {
        addPetPage.clickOnBtnCreate();
    }

    @Then("^HomePage should be showed Again$")
    public void homepageShouldBeShowedAgain() {
        homePage.verifyThatelementsAreDisplayed();
        Assert.assertEquals(homePage.verifyTheTitlePage(),"PetMatch");
    }
    @After
    public void cleanUp(){
        closeMobileDriver();
    }
}
