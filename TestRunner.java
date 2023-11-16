package com.instalanes.testrunner;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.instalanes.factory.DriverFactory;
import com.instalanes.hooks.Hooks;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = "src/test/resources/features", 
glue = {"com.instalanes.stepdefinitions","com.instalanes.hooks"}, dryRun = false, plugin = {
		"pretty",
		"html:/instalanes/test-output/cucumber-reports/CucumberReport.html" },tags = "@sm" , monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {

    @Parameters("browser")
    @BeforeClass
    public void setUpBeforeClass(String browser) {
    	System.out.println("Before method executed. Browser: " + browser);
        Hooks.driver = DriverFactory.createDriver(browser);
        DriverFactory.setDriver(Hooks.driver);
    }

    @AfterClass
    public void tearAfterClass() {
        System.out.println("Tearing down WebDriver after class...");
        WebDriver driver = DriverFactory.getDriver();
        if (driver != null) {
            driver.quit();
            DriverFactory.setDriver(null);
        }
    }
}


	


