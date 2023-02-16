package com.amazon.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before(order = 1)
    public void beforeScenario() {
        System.out.println("Before Scenario");
    }
    @After
    public void afterScenario() {
        System.out.println("After Scenario");
    }
    @BeforeStep
    public void beforeStep() {
        System.out.println("Before Step");
    }
    @AfterStep
    public void afterStep() {
        System.out.println("After Step");
    }




}
