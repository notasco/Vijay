package com.instalanes.hooks;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.instalanes.factory.DriverFactory;
import com.instalanes.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {



public static WebDriver driver;

@Parameters("browser")
@BeforeClass
public void setUpBeforeClass(String browser) {
    Hooks.driver = DriverFactory.createDriver(browser);
    DriverFactory.setDriver(driver);
}

@AfterClass
public void tearAfterClass() {
    WebDriver driver = DriverFactory.getDriver();
    if (driver != null) {
        driver.quit();
        DriverFactory.setDriver(null);
    }


}
}