package com.instalanes.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.instalanes.factory.DriverFactory;
import com.instalanes.pages.ForgotPasswordPage;

import io.cucumber.java.en.When;

public class ForgotPasswordPageSteps {
	@When("user Place a URl in Browser {string}")
	public void user_place_a_u_rl_in_browser(String URl) {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.launchUrl(URl);
	}

	@When("User click on ForgotPassword button")
	public void user_click_on_forgot_password_button() {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.forPasswordBtn();
	}

	@When("User Validate ForgotPassword Title should be {string}")
	public void user_validate_forgot_password_title_should_be(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver()
				.findElement(By.xpath("//h5[contains(text(),'Forgot password ?')]"));
		String actualTitle = LoginHeader.getText(); // Get the text of the element

		System.out.println("Actual Title Value: " + actualTitle);

		Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle),
				"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@When("User enter valid Email id into the Email Textfiled {string}")
	public void user_enter_valid_email_id_into_the_email_textfiled(String Email) {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.regEmailText(Email);
	}

	@When("User click on Generate Otp button")
	public void user_click_on_generate_otp_button() {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.geneOtpButton();
	}

	@When("User Enter Otp in Otp TextField")
	public void user_enter_otp_in_otp_text_field() {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.otpTxt("1234");
		fpp.otpVer();
	}

	@When("User Validate Setup Password title should be {string}")
	public void user_validate_setup_password_title_should_be(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver()
				.findElement(By.xpath("//h5[contains(text(),'Set up Password')]"));
		String actualTitle = LoginHeader.getText(); // Get the text of the element

		System.out.println("Actual Title Value: " + actualTitle);

		Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle),
				"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@When("User enter New Password {string}")
	public void user_enter_new_password(String password) {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.newPasswordTxt(password);
	}

	@When("User enter conform password {string}")
	public void user_enter_conform_password(String password) {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.confoPasswordTxt(password);
	}

	@When("User click on Setup password button")
	public void user_click_on_setup_password_button() {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.setupPasswordBtn();
	}

	@When("User validate Login Page Title Should be {string}")
	public void user_validate_login_page_title_should_be(String expectedTitle) {
		// WebElement LoginHeader =
		// DriverFactory.getDriver().findElement(By.xpath("//h3[contains(text(),'Log
		// in')]"));
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(30));
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Log in')]")));

		String actualTitle = element.getText(); // Get the text of the element

		System.out.println("Actual Title Value: " + actualTitle);

		Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle),
				"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@When("User Enter Email into Email TextField {string}")
	public void user_enter_email_into_email_text_field(String Email) {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.setUserName(Email);
	}

	@When("User Enter new Password into the password textfiled {string}")
	public void user_enter_new_password_into_the_password_textfiled(String password) {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.setPassword(password);
		fpp.logIn();
	}

	@When("user validate homePage Title {string}")
	public void user_validate_home_page_title(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath(
				"//div[@class='MuiBox-root css-6h4npt']/..//p[@class='MuiTypography-root MuiTypography-body1 css-1kpk2c4']"));
		String actualTitle = LoginHeader.getText();
		System.out.println("Actual Title Value: " + actualTitle);
		Assert.assertTrue(actualTitle.trim().equalsIgnoreCase(expectedTitle),
				"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@When("user click on Logout button")
	public void user_click_on_logout_button() {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.mvButton();
		fpp.logOut();
		fpp.yesButton();
	}

	@When("user close on browser")
	public void user_close_on_browser() {
		DriverFactory.getDriver().quit();
	}

	@When("users Place a URl in Browser {string}")
	public void users_place_a_u_rl_in_browser(String URL) {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.launchUrl(URL);
	}

	@When("Users click on ForgotPassword button")
	public void users_click_on_forgot_password_button() {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.forPasswordBtn();
	}

	@When("Users Validate ForgotPassword Title should be {string}")
	public void users_validate_forgot_password_title_should_be(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver()
				.findElement(By.xpath("//h5[contains(text(),'Forgot password ?')]"));
		String actualTitle = LoginHeader.getText(); // Get the text of the element

		System.out.println("Actual Title Value: " + actualTitle);

		Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle),
				"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@When("Users enter valid Mobile Number into the Mobile Textfiled {string}")
	public void users_enter_valid_mobile_number_into_the_mobile_textfiled(String Mobile) {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.phoneButton();
		fpp.codeDrp();
		fpp.codeDrpOpt();
		fpp.mobTxt(Mobile);

	}

	@When("Users Click on generate otp button")
	public void users_click_on_generate_otp_button() {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.geneOtpButton();
	}

	@When("Users Enters Otp in Otp TextField")
	public void users_enters_otp_in_otp_text_field() {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.otpTxt("1234");
		fpp.otpVer();
	}

	@When("Users Validate Setup Password title should be {string}")
	public void users_validate_setup_password_title_should_be(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver()
				.findElement(By.xpath("//h5[contains(text(),'Set up Password')]"));
		String actualTitle = LoginHeader.getText(); // Get the text of the element

		System.out.println("Actual Title Value: " + actualTitle);

		Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle),
				"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@When("Users enter newPassword {string}")
	public void users_enter_new_password(String password) {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.newPasswordTxt(password);
	}

	@When("Users enter conformPassword {string}")
	public void users_enter_conform_password(String password) {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.confoPasswordTxt(password);
	}

	@When("Users click on SetupPassword button")
	public void users_click_on_setup_password_button() {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.setupPasswordBtn();
	}

	@When("Users validate LoginPage Title Should be {string}")
	public void users_validate_login_page_title_should_be(String expectedTitle) {
		// WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath("//h3[contains(text(),'Log in')]"));
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(50));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Log in')]")));
       String actualTitle = element.getText(); // Get the text of the element
		System.out.println("Actual Title Value: " + actualTitle);
		Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle),
				"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@When("Users Enters Mobile Number into Mobile TextField {string}")
	public void users_enters_mobile_number_into_mobile_text_field(String Mobile) {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.setMobileName(Mobile);
	}

	@When("Users Enters New Password into the password textfiled {string}")
	public void users_enters_new_password_into_the_password_textfiled(String password) {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.setPassword(password);
		fpp.logIn();
	}

	@When("users validate homePage Title {string}")
	public void users_validate_home_page_title(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath(
				"//div[@class='MuiBox-root css-6h4npt']/..//p[@class='MuiTypography-root MuiTypography-body1 css-1kpk2c4']"));
		String actualTitle = LoginHeader.getText();
		System.out.println("Actual Title Value: " + actualTitle);
		Assert.assertTrue(actualTitle.trim().equalsIgnoreCase(expectedTitle),
				"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@When("users click on Log out button")
	public void users_click_on_log_out_button() {
		ForgotPasswordPage fpp = new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.mvButton();
		fpp.logOut();
		fpp.yesButton();
	}

	@When("users close Browser")
	public void users_close_browser() {
		DriverFactory.getDriver().quit();
	}




	@When("User is on LoginPage and click on forgorPassword Button")
	public void user_is_on_login_page_and_click_on_forgor_password_button() {
		DriverFactory.getDriver().get("https://frontendnewopt.vercel.app/login");
		ForgotPasswordPage fpp= new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.forPasswordBtn();
	
	}

	@When("User validate Forgotpassword Page Title should be {string}")
	public void user_validate_forgotpassword_page_title_should_be(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver()
				.findElement(By.xpath("//h5[contains(text(),'Forgot password ?')]"));
		String actualTitle = LoginHeader.getText(); // Get the text of the element

		System.out.println("Actual Title Value: " + actualTitle);

		Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle),
				"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@When("User Navigate To LoginPage")
	public void user_navigate_to_login_page() {
	   ForgotPasswordPage fpp= new ForgotPasswordPage(DriverFactory.getDriver());
			   fpp.navLoginPgBtn();
	}

	@When("User Validate Login Title should be {string}")
	public void user_validate_login_title_should_be(String expectedTitle) {
		// WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath("//h3[contains(text(),'Log in')]"));
				WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(50));
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Log in')]")));
		       String actualTitle = element.getText(); // Get the text of the element
				System.out.println("Actual Title Value: " + actualTitle);
				Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle),
						"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@When("User Navigate to SignupPage")
	public void user_navigate_to_signup_page() {
		DriverFactory.getDriver().navigate().back();
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		ForgotPasswordPage fpp= new ForgotPasswordPage(DriverFactory.getDriver());
		fpp.navSignupPgBtn();
	}

	@When("User Validate SignupPage Title should be {string}")
	public void user_validate_signup_page_title_should_be(String expectedTitle) {
		 WebElement newUserHeader = DriverFactory.getDriver().findElement(By.xpath("//h3[text()='New user?']"));
		    String actualTitle = newUserHeader.getText(); // Get the text of the element

		    System.out.println("Actual Title Value: " + actualTitle);

		    Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle),"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@When("User close Browser")
	public void user_close_browser() {
	    DriverFactory.getDriver().quit();
	}




}
