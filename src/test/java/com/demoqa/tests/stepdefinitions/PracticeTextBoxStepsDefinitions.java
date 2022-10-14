package com.demoqa.tests.stepdefinitions;

import com.demoqa.steps.PracticeFormPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PracticeTextBoxStepsDefinitions {

    @Steps
    PracticeFormPageSteps practiceFormPageSteps;

    @Given("^make practice of the demoqa page$")
    public void makePracticeOfTheDemoqaPage() {

        practiceFormPageSteps.openBrowser();


    }

    @When("^Fill in all the fields of the record$")
    public void fillInAllTheFieldsOfTheRecord() throws InterruptedException {
        practiceFormPageSteps.completeForm();

    }

    @Then("^he should see him data down$")
    public void heShouldSeeHimDataDown() {

    }
}
