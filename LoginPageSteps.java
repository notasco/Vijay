package com.instalanes.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.instalanes.factory.DriverFactory;
import com.instalanes.hooks.Hooks;
import com.instalanes.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginPageSteps {
	WebDriver driver;

	@Given("User opens URL {string}")
	public void user_opens_URL(String URL) throws InterruptedException {
	
		this.driver = Hooks.driver;
		 
	        LoginPage lp = new LoginPage(driver);
	        lp.launchUrl(URL);
	        Thread.sleep(3000);
	}

	@When("User enters Email as {string}")
	public void user_enters_email_as(String Email) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(Email);
		Thread.sleep(3000);

	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);

		lp.setPassword(password);
		Thread.sleep(3000);
	}

	@When("Click on Login")
	public void click_on_login() {
		LoginPage lp = new LoginPage(driver);
		lp.logIn();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String Title) {
		if (driver.getPageSource().contains("Login was unsuccessful")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(Title, driver.getTitle());
		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.logOut();
		Thread.sleep(3000);
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
	}
}
