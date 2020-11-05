package com.automatization.automatization_demo.certificacion.userInterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final Target DIV_HOME_DASHBOARD = Target.the("home page")
            .located(By.id("dashboardform"));
}
