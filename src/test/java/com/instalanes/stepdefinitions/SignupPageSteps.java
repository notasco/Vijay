package com.instalanes.stepdefinitions;
<<<<<<< HEAD

=======
>>>>>>> d13b6159ecede8b4e0a128deff6de411ceb857bb
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.instalanes.factory.DriverFactory;
import com.instalanes.pages.SignupPage;
<<<<<<< HEAD
import io.cucumber.java.en.Given;
=======
>>>>>>> d13b6159ecede8b4e0a128deff6de411ceb857bb
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupPageSteps {
	WebDriver driver;
	@Given("User is on the sign-up page")
	public void user_is_on_the_sign_up_page() {
	   DriverFactory.getDriver().get("https://frontendnewopt.vercel.app/register");
	}

	@Then("Validate user is landed on sign up page {string}")
	public void validate_user_is_landed_on_sign_up_page(String expectedTitle) {
		 WebElement newUserHeader = DriverFactory.getDriver().findElement(By.xpath("//h3[text()='New user?']"));
		    String actualTitle = newUserHeader.getText(); // Get the text of the element

		    System.out.println("Actual Title Value: " + actualTitle);

		    Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle),"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
		}

	@When("User navigates to the Terms page")
	public void user_navigates_to_the_terms_page() {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
	   sp.termButton();
	}

	@Then("Validate user is landed on terms page {string}")
	public void validate_user_is_landed_on_terms_page(String expectedTitle){
		 String actualTitle = DriverFactory.getDriver().getTitle();
		    System.out.println("Actual Title Value: " + actualTitle);

		    Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle),"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}
	@When("User navigates to the AlreadyRegistered Login page")
	public void user_navigates_to_the_already_registered_login_page() {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		  DriverFactory.getDriver().navigate().back();
		  sp.allRegLoginBtn();
	}

	@Then("Validate user landed on AlreadyRegistered Login page {string}")
	public void validate_user_landed_on_already_registered_login_page(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath("//h3[text()='Log in']"));
	    String actualTitle = LoginHeader.getText(); // Get the text of the element

	    System.out.println("Actual Title Value: " + actualTitle);

	    Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle),"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}
	
	@When("User navigates to the Policy page")
	public void user_navigates_to_the_policy_page() {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		  DriverFactory.getDriver().navigate().back();
	sp.policyButton();
	}

	@Then("Validate user is landed on Policy page {string}")
	public void validate_user_is_landed_on_policy_page(String expectedTitle) {
		 String actualTitle = DriverFactory.getDriver().getTitle();
		    System.out.println("Actual Title Value: " + actualTitle);

		    Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle),"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	        DriverFactory.getDriver().quit();
	}
	
	@When("User enters Firstname as {string}")
	public void user_enters_firstname_as(String Firstname) throws InterruptedException {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		DriverFactory.getDriver().get("https://frontendnewopt.vercel.app/register");
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		sp.setFrstName(Firstname);

	}

	@When("User enters Lastname as {string}")
	public void user_enters_lastname_as(String Lastname) throws InterruptedException {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.setLstName(Lastname);

	}

	@When("User click organisation role dropDown")
	public void user_click_organisation_role_drop_down() {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.dpOrg();
	}

	@When("User select organisation role option")
	public void user_select_organisation_role_option() {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.dpOrgSel();
	}

	@When("User click  code dropDown")
	public void user_click_code_drop_down() {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.codeDp();
	}

	@When("User select code option")
	public void user_select_code_option() {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.codeDpSel();
	}

	@When("User enters number as {string}")
	public void user_enters_number_as(String number) {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.phNum(number);
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

	@When("User click Phone verfication and Enter otp into the textfields")
	public void user_click_phone_verfication_and_enter_otp_into_the_textfields() {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.verPhn();
		sp.otpPhn("1234");
	}

	@When("User given Phone otp should verfied")
	public void user_given_phone_otp_should_verfied() {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.otpVerPh();
	}

	@When("User enters email as {string}")
	public void user_enters_email_as(String email) {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.emailTxt(email);
<<<<<<< HEAD
=======
		 DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    sp.emailVer();
	    sp.emailOtp("1234");
	    sp.emailOtpVer();
>>>>>>> d13b6159ecede8b4e0a128deff6de411ceb857bb
	}

	@When("User click Email verfication and Enter otp into the textfields")
	public void user_click_email_verfication_and_enter_otp_into_the_textfields() {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.emailVer();
		sp.emailOtp("1234");
	}

	@When("User given Email otp should verfied")
	public void user_given_email_otp_should_verfied() {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.emailOtpVer();

	}

	@When("User enter password as {string}")
	public void user_enters_password_as(String password) {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.passTxt(password);
	}

	@When("User click on sign-up button")
	public void user_click_on_sign_up_button() {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.signup();
	}

	@Then("HomePage Title should be {string}")
	public void home_page_title_should_be(String expectedTitle) {
		 String actualTitle = DriverFactory.getDriver().getTitle();
		    System.out.println("Actual Title Value: " + actualTitle);

		    Assert.assertEquals(actualTitle, expectedTitle, "Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);

	}
	@Then("User click LogOut and close Browser")
	public void user_click_log_out_and_close_browser() {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.mvButton();
		sp.logOut();
		sp.yesButton();
		DriverFactory.getDriver().quit();
	}
	@Given("User opens URL {string}")
	public void only_user_opens_url(String URL) {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.launchUrl(URL);
	}

	@Given("Validate user landed on Login page {string}")
	public void validate_user_landed_on_login_page(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath("//h3[text()='Log in']"));
	    String actualTitle = LoginHeader.getText(); // Get the text of the element

	    System.out.println("Actual Title Value: " + actualTitle);

	    Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle),"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@Given("User enters Email as {string}")
	public void only_user_enters_email_as(String Email) {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.setUserName(Email);
	}

	@Given("User enters password as {string}")
	public void only_user_enters_password_as(String password) {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.setPassword(password);
	}

	@Given("User click on Login button and HomePage should be Dispaly")
	public void only_user_click_on_login_button_and_home_page_should_be_dispaly() {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.logIn();
	}

	@Given("Validate user landed on Homepage {string}")
	public void validate_user_landed_on_homepage(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath("//div[@class='MuiBox-root css-6h4npt']/..//p[@class='MuiTypography-root MuiTypography-body1 css-1kpk2c4']"));
	    String actualTitle = LoginHeader.getText(); // Get the text of the element

	    System.out.println("Actual Title Value: " + actualTitle);

	    Assert.assertTrue(actualTitle.trim().equalsIgnoreCase(expectedTitle),"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@When("User navigates to the profile page")
	public void only_user_navigates_to_the_profile_page() {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.mvButton();
		sp.profileButoon();
	}

	@When("Validate user landed on profile page {string}")
	public void validate_user_landed_on_profile_page(String expectedTitle) {
		WebElement ProfileHeader = DriverFactory.getDriver().findElement(By.xpath("//h6[contains(text(),'Healthcart')]"));
	    String actualTitle = ProfileHeader.getText(); // Get the text of the element

	    System.out.println("Actual Title Value: " + actualTitle);

	    Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle),"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@Then("Validate user username on profile page {string}")
	public void validate_user_username_on_profile_page(String expectedUserName) {
		WebElement UserName = DriverFactory.getDriver().findElement(By.xpath("//a[text()='vijaybmvj.821@gmail.com']"));
	    String actualUserName = UserName.getText(); // Get the text of the element

	    System.out.println("Actual Title Value: " + actualUserName);

	    Assert.assertTrue(actualUserName.equalsIgnoreCase(expectedUserName),"Title validation failed. Expected: " + expectedUserName+ ", Actual: " + actualUserName);
	}

	@Then("Validate user phone number on profile page {string}")
	public void validate_user_phone_number_on_profile_page(String expectedPhone) {
		WebElement phoneNum = DriverFactory.getDriver().findElement(By.xpath("//a[text()='+91 9988773344']"));
	    String actualPhone = phoneNum.getText(); 

	    System.out.println("Actual Title Value: " + actualPhone);

	    Assert.assertTrue(actualPhone.equalsIgnoreCase(expectedPhone),"Title validation failed. Expected: " + expectedPhone + ", Actual: " + actualPhone);
	}

	@Then("validate user FirstName on profile page {string}")
	public void validate_user_first_name_on_profile_page(String expectedFirstName) {
		WebElement FirstName = DriverFactory.getDriver().findElement(By.xpath("//div[text()='First name']/..//div[text()='Muthu']"));
	    String actualFirstName= FirstName.getText(); 

	    System.out.println("Actual Title Value: " + actualFirstName);

	    Assert.assertTrue(actualFirstName.equalsIgnoreCase(expectedFirstName),"Title validation failed. Expected: " + expectedFirstName + ", Actual: " + actualFirstName);
	}

	@Then("Validate user LastName on profile page {string}")
	public void validate_user_last_name_on_profile_page(String expectedLastName) {
		WebElement LastNme = DriverFactory.getDriver().findElement(By.xpath("//div[text()='Last name']/..//div[text()='Vijay']"));
	    String actualLastName= LastNme.getText(); // Get the text of the element

	    System.out.println("Actual Title Value: " + actualLastName);

	    Assert.assertTrue(actualLastName.equalsIgnoreCase(expectedLastName),"Title validation failed. Expected: " + expectedLastName + ", Actual: " + actualLastName);
	}

	@Then("User click on Logout button and close browser")
	public void only_user_click_on_logout_button_and_close_browser() {
		SignupPage sp = new SignupPage(DriverFactory.getDriver());
		sp.mvButton();
		sp.logOut();
		sp.yesButton();
		DriverFactory.getDriver().quit();
	}



}