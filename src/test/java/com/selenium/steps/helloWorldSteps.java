package com.selenium.steps;

import com.selenium.framework.ParentScenario;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class helloWorldSteps extends ParentScenario {

    @Given("^I access to the browser$")
    public void iAccessToTheBrowser(){
        startBrowser();
    }

    @When("^I go to the \"([^\"]*)\"$")
    public void iGoToThe(String url) {
        nativateTo(url);
    }

    @Then("^I close the driver$")
    public void iCloseTheDriver(){
        closeWebDriver();
    }
}
