package com.amazon.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/newCucumber.html",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/Feature",
        glue = "com/amazon/step_definitions",
        dryRun = false,
        tags = "@wip"
)
public class Cukes_Runner {
}
