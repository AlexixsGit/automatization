package com.automatization.automatization_demo.stepdefinitions;

import com.automatization.automatization_demo.certificacion.questions.ValidateSuccessfulAuthenticationQuestion;
import com.automatization.automatization_demo.certificacion.tasks.WriteDocumentNumberTask;
import com.automatization.automatization_demo.certificacion.tasks.WritePasswordTask;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import javax.xml.bind.helpers.ValidationEventLocatorImpl;
import java.util.Map;

import static com.automatization.automatization_demo.certificacion.userInterfaces.HomePage.DIV_HOME_DASHBOARD;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AuthenticationStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver webDriver;

    private Actor actor = Actor.named("svPyme");

    @Given("Open the svpyme page in the browser")
    public void setUp() {
        this.actor.can(BrowseTheWeb.with(webDriver));
        this.actor.wasAbleTo(Open.url("https://sucursalvirtualnegociostest.mybluemix.net/"));
    }

    @And("The user authenticates")
    public void authenticateUser(Map<String, String> map) {
        this.actor.attemptsTo(WriteDocumentNumberTask.writeDocumentNumberTask(map.get("documentNumber")),
                WritePasswordTask.writePasswordTask(map.get("password")));
    }

    @Then("Should see the main page")
    public void shouldSeeTheMainPage() {
        this.actor.attemptsTo(WaitUntil.the(DIV_HOME_DASHBOARD, isVisible()));
        this.actor.should(seeThat(ValidateSuccessfulAuthenticationQuestion.validateSuccessfulAuthenticationQuestion()));
    }

}
