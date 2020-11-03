package com.automatization.automatization_demo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/authentication.feature",
        glue = "com.automatization.automatization_demo.stepdefinitions",
        tags = "@Auth1", snippets = SnippetType.CAMELCASE)
public class AuthenticationRunner {
}
