package com.automatization.automatization_demo.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.automatization.automatization_demo.certificacion.userInterfaces.AuthenticationPage.BUTTON_ENTER_LOGIN;
import static com.automatization.automatization_demo.certificacion.userInterfaces.AuthenticationPage.INPUT_PASSWORD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WritePasswordTask implements Task {

    private String password;

    public WritePasswordTask(String password) {
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(INPUT_PASSWORD), Enter.theValue(this.password).into(INPUT_PASSWORD),
                Click.on(BUTTON_ENTER_LOGIN));
    }

    public static WritePasswordTask writePasswordTask(String password) {
        return instrumented(WritePasswordTask.class, password);
    }
}
