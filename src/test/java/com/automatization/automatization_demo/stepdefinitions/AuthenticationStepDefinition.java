package com.automatization.automatization_demo.stepdefinitions;

import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class AuthenticationStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver webDriver;

    private Actor actor = Actor.named("svPyme");

    @Given("Open the svpyme page in the browser")
    public void setUp() {
        this.actor.can(BrowseTheWeb.with(webDriver));
        this.actor.wasAbleTo(Open.url("https://sucursalvirtualnegociostest.mybluemix.net/"));
    }
}
