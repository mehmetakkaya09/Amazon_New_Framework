package com.amazon.step_definitions;

import com.amazon.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before(order = 1)
    public void beforeScenario() {
        System.out.println("Before Scenario");
    }
    @After
    public void afterScenario(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

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
