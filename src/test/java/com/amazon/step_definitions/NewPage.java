package com.amazon.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class NewPage {


    @When("anything run")
    public void anything_run(List<String> fruits) {
        System.out.println(fruits);
    }
    @Then("finish")
    public void finish(Map<String, String> data) {
        System.out.println(data);

    }

}
