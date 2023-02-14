package com.amazon.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/newCucumber.html",
features = "src/test/resources/Feature",
        glue = "com/amazon/step_definitions"
)
public class Cukes_Runner {
}
