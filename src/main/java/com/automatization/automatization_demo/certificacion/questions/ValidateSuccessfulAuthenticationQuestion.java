package com.automatization.automatization_demo.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.automatization.automatization_demo.certificacion.userInterfaces.HomePage.DIV_HOME_DASHBOARD;

public class ValidateSuccessfulAuthenticationQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(Ensure.that(DIV_HOME_DASHBOARD).isEnabled());
        return true;
    }

    public static ValidateSuccessfulAuthenticationQuestion validateSuccessfulAuthenticationQuestion() {
        return new ValidateSuccessfulAuthenticationQuestion();
    }
}
