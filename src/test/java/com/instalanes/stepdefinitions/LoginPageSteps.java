package com.instalanes.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.instalanes.factory.DriverFactory;
import com.instalanes.pages.LoginPage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	WebDriver driver;

	@Given("User opens browser and enter URL {string}")
	public void user_opens_browser_and_enter_URL(String URL) throws InterruptedException {
		LoginPage lp = new LoginPage(DriverFactory.getDriver());
		lp.launchUrl(URL);
		Assert.assertTrue(DriverFactory.getDriver().getCurrentUrl().contains(URL));
	}

	@When("User enters Email {string}")
	public void user_enters_email(String Email) throws InterruptedException {
		LoginPage lp = new LoginPage(DriverFactory.getDriver());
		lp.setUserName(Email);
		Assert.assertEquals(Email, lp.getUserName());
	}

	@When("User enters password {string}")
	public void user_enters_password(String password) throws InterruptedException {
		LoginPage lp = new LoginPage(DriverFactory.getDriver());
		lp.setPassword(password);
		Assert.assertEquals(password, lp.getPassword());
	}

	@When("Click on Login")
	public void click_on_login() {
		LoginPage lp = new LoginPage(DriverFactory.getDriver());
		lp.logIn();
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String Title) {
		if (DriverFactory.getDriver().getPageSource().contains("Login was unsuccessful")) {
			DriverFactory.getDriver().close();
			Assert.fail("Login was unsuccessful");
		} else {
			Assert.assertEquals(Title, DriverFactory.getDriver().getTitle());
		}
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		LoginPage lp = new LoginPage(DriverFactory.getDriver());
		lp.mvButton();
		lp.logOut();
		lp.yesButton();
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@Then("close browser")
	public void close_browser() {
		DriverFactory.getDriver().quit();
	}



	@Given("User open URL {string}")
	public void user_open_url(String URL) {
		LoginPage lp = new LoginPage(DriverFactory.getDriver());
	    lp.launchUrl(URL);
	}

	@Given("User enters Mobile as {string}")
	public void user_enters_mobile_as(String Mobile) {
		LoginPage lp = new LoginPage(DriverFactory.getDriver());
        lp.setMobileName(Mobile);
	}

	@Given("Users enters Password {string}")
	public void users_enters_password(String Password) {
		LoginPage lp = new LoginPage(DriverFactory.getDriver());
		 lp.setPassword(Password);
	}

	@Given("User Click on Login")
	public void user_click_on_login() {
		LoginPage lp = new LoginPage(DriverFactory.getDriver());
		 lp.logIn();
	}

	@Then("Validate HomePage Title should be {string}")
	public void validate_home_page_title_should_be(String expectedTitle) {
	WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath("//div[@class='MuiBox-root css-6h4npt']/..//p[@class='MuiTypography-root MuiTypography-body1 css-1kpk2c4']"));
    String actualTitle = LoginHeader.getText(); 

    System.out.println("Actual Title Value: " + actualTitle);

    Assert.assertTrue(actualTitle.trim().equalsIgnoreCase(expectedTitle),"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	
	}

	@When("User click on Log out")
	public void user_click_on_log_out() {
		LoginPage lp = new LoginPage(DriverFactory.getDriver());
		 lp.mvButton();
		 lp.logOut();
		 lp.yesButton();
	}
	@Then("User close browser")
	public void user_close_browser() {
		DriverFactory.getDriver().quit();
		
	}

	@Given("User only opens URL {string}")
	public void user_only_opens_url(String URL) {
		LoginPage lp = new LoginPage(DriverFactory.getDriver());
		lp.launchUrl(URL);
	}

	@Given("User only enters Email as {string}")
	public void user_only_enters_email_as(String Email) {
		LoginPage lp = new LoginPage(DriverFactory.getDriver());
		lp.setUserName(Email);
	}

	@Given("User only enter password as {string}")
	public void user_only_enter_password_as(String password) {
		LoginPage lp = new LoginPage(DriverFactory.getDriver());
		lp.setPassword(password);
	}

	@Given("User Only click on Login")
	public void user_only_click_on_login() {
		LoginPage lp = new LoginPage(DriverFactory.getDriver());
		lp.logIn();
	}

	@Then("User homePage Title should be {string}")
	public void user_home_page_title_should_be(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath("//div[@class='MuiBox-root css-6h4npt']/..//p[@class='MuiTypography-root MuiTypography-body1 css-1kpk2c4']"));
		String actualTitle = LoginHeader.getText();
		System.out.println("Actual Title Value: " + actualTitle);
		Assert.assertTrue(actualTitle.trim().equalsIgnoreCase(expectedTitle),
				"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@Then("User click on Vechicle Module")
	public void only_user_click_on_vechicle_module() {
		LoginPage lp = new LoginPage(DriverFactory.getDriver());
		lp.carrerButton();
		lp.vehcileButton();
	}

	@Then("User VehiclePage Title Should be {string}")
	public void user_vehicle_page_title_should_be(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath("//h6[contains(text(),'Vehicles')]"));
		String actualTitle = LoginHeader.getText();
		System.out.println("Actual Title Value: " + actualTitle);
		String actualTitleCleaned = actualTitle.toLowerCase().replaceAll("\\s", "");
		String expectedTitleCleaned = expectedTitle.toLowerCase().replaceAll("\\s", "");
		Assert.assertEquals(actualTitleCleaned, expectedTitleCleaned, "Title validation failed.");
	}

	@Then("User click on Driver Module")
	public void only_user_click_on_driver_module() {
		LoginPage lp = new LoginPage(DriverFactory.getDriver());
		lp.carrerButton();
		lp.driverButton();
	}

	@Then("User DriverPage Title Should be {string}")
	public void user_driver_page_title_should_be(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath("//h6[contains(text(),'Drivers')]"));
		String actualTitle = LoginHeader.getText();
		System.out.println("Actual Title Value: " + actualTitle);	
		String actualTitleCleaned = actualTitle.toLowerCase().replaceAll("\\s", "");
		String expectedTitleCleaned = expectedTitle.toLowerCase().replaceAll("\\s", "");
    	Assert.assertEquals(actualTitleCleaned, expectedTitleCleaned, "Title validation failed.");
	}

	@Then("User click on document Module")
	public void only_user_click_on_document_module() {
		LoginPage lp = new LoginPage(DriverFactory.getDriver());
		lp.myCompanyButton();
		lp.documentButton();

	}

	@Then("User DocumentPage Titl should be {string}")
	public void user_document_page_titl_should_be(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath("//h6[contains(text(),'Document')]"));
		String actualTitle = LoginHeader.getText();
		System.out.println("Actual Title Value: " + actualTitle);
		String actualTitleCleaned = actualTitle.toLowerCase().replaceAll("\\s", "");
		String expectedTitleCleaned = expectedTitle.toLowerCase().replaceAll("\\s", "");
		Assert.assertEquals(actualTitleCleaned, expectedTitleCleaned, "Title validation failed.");
	}

	@When("User Only click on Log out link")
	public void user_only_click_on_log_out_link() {
		LoginPage lp = new LoginPage(DriverFactory.getDriver());
		lp.mvButton();
		lp.logOut();
		lp.yesButton();
	}

	@Then("User only close browser")
	public void user_only_close_browser() {
		DriverFactory.getDriver().quit();
	}

}