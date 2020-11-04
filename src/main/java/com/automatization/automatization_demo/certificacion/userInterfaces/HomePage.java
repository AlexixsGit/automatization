package com.automatization.automatization_demo.certificacion.userInterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target DIV_HOME_DASHBOARD = Target.the("home page")
            .located(By.id("dashboardform"));
}
