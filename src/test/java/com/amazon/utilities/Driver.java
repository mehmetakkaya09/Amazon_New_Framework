package com.amazon.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver() {
    }
    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();
    //private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driverPool.get() == null) {

            String browser = ConfigurationReader.keyValue("browser");

            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driverPool.set(new ChromeDriver());
                driverPool.get().manage().window().maximize();
                driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            } else if (browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driverPool.set(new FirefoxDriver());
                driverPool.get().manage().window().maximize();
                driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }

        }
        return driverPool.get();
    }

    public static void quitDriver() {
        if (driverPool.get()!= null) {
            driverPool.get().quit();
            driverPool.remove();
        }
    }


}
