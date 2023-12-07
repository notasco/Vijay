package com.instalanes.testrunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import com.instalanes.factory.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", 
glue = {"com.instalanes.stepdefinitions","com.instalanes.hooks"}, dryRun = false, 
plugin = {
		"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		 
		},tags = "@s" , monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {
	  WebDriver driver;
	 @Parameters("browser")
	@BeforeMethod
	public void setUpBeforeClass(String browser) {
		System.out.println("Before method.Browser: " + browser);
		driver = DriverFactory.createDriver(browser);
		DriverFactory.getDriver().manage().window().maximize();
		
	 }
	@AfterClass
	public void tearAfterClass() {
		WebDriver driver = DriverFactory.getDriver();
		if (driver != null) {
			driver.quit();
		}
	}
}