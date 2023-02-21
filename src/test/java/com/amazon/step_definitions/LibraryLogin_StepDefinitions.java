package com.amazon.step_definitions;

import com.amazon.pages.LibraryPages;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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


    @When("User should be able to write username {string}")
    public void userShouldBeAbleToWriteUsername(String string) {

        locators.inputEmail.sendKeys(string);

    }

    @And("User should be able to write password {string}")
    public void userShouldBeAbleToWritePassword(String arg0) {

        locators.inputPassword.sendKeys(arg0);
    }

    @Then("User should be able to see dashboard")
    public void userShouldBeAbleToSeeDashboard() {
        Assert.assertFalse(ConfigurationReader.keyValue("libraryURL").equals(Driver.getDriver().getCurrentUrl()));
    }
}
