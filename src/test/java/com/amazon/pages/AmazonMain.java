package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMain {

    public AmazonMain() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@id='icp-nav-flyout']")

    public WebElement language;

    @FindBy(xpath = "(//span[.='English'])[1]")

    public WebElement english;


}
