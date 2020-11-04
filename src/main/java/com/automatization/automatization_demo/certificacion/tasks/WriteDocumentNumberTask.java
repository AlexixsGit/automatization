package com.automatization.automatization_demo.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.automatization.automatization_demo.certificacion.userInterfaces.AuthenticationPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WriteDocumentNumberTask implements Task {

    private String documentNumber;

    public WriteDocumentNumberTask(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LIST_BOX_DOCUMENT_TYPE), Click.on(LIST_BOX_DOCUMENT_TYPE_CC),
                Click.on(INPUT_DOCUMENT_NUMBER), Enter.theValue(this.documentNumber).into(INPUT_DOCUMENT_NUMBER),
                Click.on(BUTTON_CONTINUE));
    }

    public static WriteDocumentNumberTask writeDocumentNumberTask(String documentNumber) {
        return instrumented(WriteDocumentNumberTask.class, documentNumber);
    }
}
