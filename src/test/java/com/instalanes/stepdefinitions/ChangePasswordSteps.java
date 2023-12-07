package com.instalanes.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.instalanes.factory.DriverFactory;
import com.instalanes.pages.ChangePassword;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangePasswordSteps {
	@When("Users opens URL {string}")
	public void users_opens_url(String URl) {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.launchUrl(URl);
	}

	@When("User Enters Email as {string}")
	public void user_enters_email_as(String Email) {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.setUserName(Email);
	}

	@When("User Enters password as {string}")
	public void user_enters_password_as(String password) {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.setPassword(password);
	}

	@When("User click on Login")
	public void user_click_on_login() {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.logIn();
	}

	@Then("HomePage Title Should Be {string}")
	public void home_page_title_should_be(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath(
				"//div[@class='MuiBox-root css-6h4npt']/..//p[@class='MuiTypography-root MuiTypography-body1 css-1kpk2c4']"));
		String actualTitle = LoginHeader.getText();
		System.out.println("Actual Title Value: " + actualTitle);
		Assert.assertTrue(actualTitle.trim().equalsIgnoreCase(expectedTitle),
				"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@Then("User click on SubMenu in profile")
	public void user_click_on_sub_menu_in_profile() {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.mvButton();
	}

	@Then("User click on ChangePassword")
	public void user_click_on_change_password() {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.changePasswordBtn();
	}

	@Then("Validate ChangePassword Title should be {string}")
	public void validate_change_password_title_should_be(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath("//h5[contains(text(),'Change password')]"));
		String actualTitle = LoginHeader.getText();
		System.out.println("Actual Title Value: " + actualTitle);
		String actualTitleCleaned = actualTitle.toLowerCase().replaceAll("\\s", "");
		String expectedTitleCleaned = expectedTitle.toLowerCase().replaceAll("\\s", "");
		Assert.assertEquals(actualTitleCleaned, expectedTitleCleaned, "Title validation failed.");
	}

	@Then("User Enter Current password {string}")
	public void user_enter_current_password(String password) {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.currentPasswordTxt(password);
	}

	@Then("User Enter New Password {string}")
	public void user_enter_new_password(String password) {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.newPasswordTxt(password);
	}

	@Then("User Enter Conform PassWord {string}")
	public void user_enter_conform_pass_word(String password) {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.conformPassTxt(password);
	}

	@Then("User click on ChangePassword Link")
	public void user_click_on_change_password_link() {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.changPasswordBtn();
	}

	@When("User Only Click on Log out link")
	public void user_only_click_on_log_out_link1() {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.mvButton();
		cps.logOut();
		cps.yesButton();
	}

	@When("User Only Enters Email as {string}")
	public void user_only_enters_email_as(String Email) {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.setUserName(Email);
	}

	@When("Validate Changed password in Login Password TextField {string}")
	public void validate_changed_password_in_login_password_text_field(String password) {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.setPassword(password);
	}

	@When("User click on Login Link")
	public void user_click_on_login_link() {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.logIn();
	}

	@When("User Only Click on LogOut link")
	public void user_only_click_on_log_out_link() {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.mvButton();
		cps.logOut();
		cps.yesButton();
	}

	@Then("User Close Browser")
	public void user_close_browser() {
		DriverFactory.getDriver().quit();
	}
	
	
	@Given("User opens URL in browser {string}")
	public void user_opens_url_in_browser(String URl) {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.launchUrl(URl);
	}

	@When("Users Only Enters Email as {string}")
	public void users_only_enters_email_as(String Email) {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.setUserName(Email);
	}

	@When("Users Only Enters Password as {string}")
	public void users_only_enters_password_as(String password) {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.setPassword(password);
	}

	@When("Users click on Login button")
	public void users_click_on_login_button() {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.logIn();
	}

	@Then("Validate homepage Title should be {string}")
	public void validate_homepage_title_should_be(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath(
				"//div[@class='MuiBox-root css-6h4npt']/..//p[@class='MuiTypography-root MuiTypography-body1 css-1kpk2c4']"));
		String actualTitle = LoginHeader.getText();
		System.out.println("Actual Title Value: " + actualTitle);
		Assert.assertTrue(actualTitle.trim().equalsIgnoreCase(expectedTitle),
				"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@Then("Users click on subMenu In profile")
	public void users_click_on_sub_menu_in_profile() {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.mvButton();
	}

	@Then("Users click on Setting link")
	public void users_click_on_setting_link() {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.settingBtn();
	}

	@Then("Validate Settings Title should be {string}")
	public void validate_settings_title_should_be(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath("//h6[contains(text(),'Settings')]"));
		String actualTitle = LoginHeader.getText();
		System.out.println("Actual Title Value: " + actualTitle);
		String actualTitleCleaned = actualTitle.toLowerCase().replaceAll("\\s", "");
		String expectedTitleCleaned = expectedTitle.toLowerCase().replaceAll("\\s", "");
		Assert.assertEquals(actualTitleCleaned, expectedTitleCleaned, "Title validation failed.");
	}

	@Then("User Validate changePassword Title Should be {string}")
	public void user_validate_change_password_title_should_be(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath("//h6[contains(text(),'Change password')]"));
		String actualTitle = LoginHeader.getText();
		System.out.println("Actual Title Value: " + actualTitle);
		String actualTitleCleaned = actualTitle.toLowerCase().replaceAll("\\s", "");
		String expectedTitleCleaned = expectedTitle.toLowerCase().replaceAll("\\s", "");
		Assert.assertEquals(actualTitleCleaned, expectedTitleCleaned, "Title validation failed.");
	}

	@Then("Users Enter currentpassword as {string}")
	public void users_enter_currentpassword_as(String password) {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.changePasswordBtn2();
		cps.currentPasswordTxt(password);
	}

	@Then("Users Enter newPassword as {string}")
	public void users_enter_new_password_as(String password) {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.newPasswordTxt(password);
	}

	@Then("Users Enter conformPassWord as {string}")
	public void users_enter_conform_pass_word_as(String password) {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.conformPassTxt(password);
	}

	@Then("Users click on ChangePassword button")
	public void users_click_on_change_password_button() {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
	cps.changPasswordBtn();
	}

	@When("Users Click on Logout button")
	public void users_click_on_logout_button() throws InterruptedException {
      ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
  	 Thread.sleep(3000);
		cps.mvButton();
		cps.logOut();
		cps.yesButton();
	}

	@When("Users Enters Email  {string}")
	public void users_enters_email(String Email) {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
	cps.setUserName(Email);
	}

	@When("User Enter Changedpassword In Password as {string}")
	public void user_enter_changedpassword_in_login_page_password_as(String password) throws InterruptedException {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
	   cps.setPassword(password);
	  
	}
	@When("User click on Login Button")
	public void user_click_on_login_button() {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		cps.logIn();
	}
	
	@Then("User Validate homepage Title should be {string}")
	public void user_validate_homepage_title_should_be(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath(
				"//div[@class='MuiBox-root css-6h4npt']/..//p[@class='MuiTypography-root MuiTypography-body1 css-1kpk2c4']"));
		String actualTitle = LoginHeader.getText();
		System.out.println("Actual Title Value: " + actualTitle);
		Assert.assertTrue(actualTitle.trim().equalsIgnoreCase(expectedTitle),
				"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}
	@When("Users Click on LogOut button")
	public void users_click_on_log_out_button() throws InterruptedException {
		ChangePassword cps = new ChangePassword(DriverFactory.getDriver());
		 Thread.sleep(3000);
		cps.mvButton();
		cps.logOut();
		cps.yesButton();
	}

	@Then("Users Close Browser")
	public void users_close_browser() {
	   DriverFactory.getDriver().quit();
	}


}
