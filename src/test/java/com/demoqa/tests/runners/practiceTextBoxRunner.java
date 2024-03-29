package com.demoqa.tests.runners;
import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/practiceTextBox.feature",
        glue = "com.demoqa.tests.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
tags = "@regression")
public class practiceTextBoxRunner {
}
