package com.selenium.steps;

import com.selenium.framework.ParentScenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class calculatorSteps extends ParentScenario {
    @Given("^I Open the calculator$")
    public void iOpenTheCalculator(){
        startAndroid();
    }

    @When("^I click the first number \"([^\"]*)\"$")
    public void iClickTheFirstNumber(String firstNumber) {
        calculatorPage.clickOnNumber(firstNumber);
    }

    @And("^I click the sum button$")
    public void iClickTheSumButton() {
        calculatorPage.clickOnOperatorSUM();
    }

    @And("^I click the second number \"([^\"]*)\"$")
    public void iClickTheSecondNumber(String secondNumber) {
        calculatorPage.clickOnNumber(secondNumber);
    }

    @And("^I click the equal button$")
    public void iClickTheEqualButton() {
        calculatorPage.clickOnOperatorEQ();
    }

    @Then("^show the expected the result as \"([^\"]*)\"$")
    public void showTheExpectedTheResultAs(String result) {
        Assert.assertTrue(calculatorPage.getResult(result));
    }

}
