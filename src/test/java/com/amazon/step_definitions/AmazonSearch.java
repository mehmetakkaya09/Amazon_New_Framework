package com.amazon.step_definitions;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class AmazonSearch {

    @Given("user is on the search page")
    public void user_is_on_the_search_page() {
        Driver.getDriver().get(ConfigurationReader.keyValue("url"));
    }
    @When("user write in the search box anything")
    public void user_write_in_the_search_box_anything() {

        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+ Keys.ENTER);

    }
    @Then("user is on the target page what written in the search box")
    public void user_is_on_the_target_page_what_written_in_the_search_box() {

        Assert.assertEquals(Driver.getDriver().getTitle(), "Amazon.com : iphone");

    }

}
