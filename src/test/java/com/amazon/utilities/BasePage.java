package com.amazon.utilities;


import org.testng.annotations.BeforeMethod;

public class BasePage {

@BeforeMethod

    public void setUp(){
    Driver.getDriver().get(ConfigurationReader.keyValue("url"));


}


}
