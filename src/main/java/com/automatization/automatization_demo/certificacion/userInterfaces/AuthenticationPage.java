package com.automatization.automatization_demo.certificacion.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class AuthenticationPage extends PageObject {

    public static final Target LIST_BOX_DOCUMENT_TYPE = Target.the("document type list")
            .located(By.xpath("//span[@class=\"mat-select-placeholder ng-tns-c6-2 ng-star-inserted\"]"));
    public static final Target LIST_BOX_DOCUMENT_TYPE_CC = Target.the("CC. document type")
            .located(By.xpath("//span[@class=\"ng-tns-c6-2 ng-star-inserted\"]"));
    public static final Target INPUT_DOCUMENT_NUMBER = Target.the("document number")
            .located(By.id("input-documentId-login"));
    public static final Target BUTTON_CONTINUE = Target.the("button continue")
            .located(By.id("button-continue-login"));
    public static final Target INPUT_PASSWORD = Target.the("password")
            .located(By.id("input-password-key"));
    public static final Target BUTTON_ENTER_LOGIN = Target.the("button enter")
            .located(By.id("button-enter-login"));
}
