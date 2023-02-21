package com.amazon.step_definitions;

import com.amazon.pages.AmazonMain;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class AmazonSearch {
    AmazonMain pages = new AmazonMain();

    @Given("user is on the search page")
    public void user_is_on_the_search_page() {
        Driver.getDriver().get(ConfigurationReader.keyValue("url"));
    }

    @When("user write in the search box anything")
    public void user_write_in_the_search_box_anything() {
        pages.searchBox.sendKeys("Iphone" + Keys.ENTER);

    }

    @Then("user is on the target page what written in the search box")
    public void user_is_on_the_target_page_what_written_in_the_search_box() {

        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

    }

    @When("something")
    public void something() {
    }

    @Then("finish again")
    public void finishAgain() {
    }
}
