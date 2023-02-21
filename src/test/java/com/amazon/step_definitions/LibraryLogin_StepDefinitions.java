package com.amazon.step_definitions;

import com.amazon.pages.LibraryPages;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LibraryLogin_StepDefinitions {

    LibraryPages locators = new LibraryPages();

    @Given("User is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.keyValue("libraryURL"));
    }

    @Then("User should be able click login button")
    public void user_should_be_able_click_login_button() {
         locators.signInButton.click();
    }


    @When("User should be able to write username {word}")
    public void userShouldBeAbleToWriteUsername(String arg0) {

        locators.inputEmail.sendKeys(arg0);

    }

    @And("User should be able to write password {}")
    public void userShouldBeAbleToWritePassword(String arg0) {

        locators.inputPassword.sendKeys(arg0);
    }
}
