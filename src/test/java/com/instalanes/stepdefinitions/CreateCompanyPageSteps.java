package com.instalanes.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.instalanes.factory.DriverFactory;
import com.instalanes.pages.CreateCompanyPage;

import io.cucumber.java.en.When;

public class CreateCompanyPageSteps {

	@When("User Login With Email Id {string}")
	public void user_login_with_email_id(String Email) {
		DriverFactory.getDriver().get("https://frontendnewopt.vercel.app/login");
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.setUserName(Email);

	}

	@When("User Login With password {string}")
	public void user_login_with_password(String password) {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.setPassword(password);
	}

	@When("User Click on Login button")
	public void user_click_on_login_button() {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.logIn();
	}

	@When("User Validate HomePage Title as {string}")
	public void user_validate_home_page_title_as(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath(
				"//div[@class='MuiBox-root css-6h4npt']/..//p[@class='MuiTypography-root MuiTypography-body1 css-1kpk2c4']"));
		String actualTitle = LoginHeader.getText();
		System.out.println("Actual Title Value: " + actualTitle);
		Assert.assertTrue(actualTitle.trim().equalsIgnoreCase(expectedTitle),
				"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@When("User click on Sub-menu Button")
	public void user_click_on_sub_menu_button() {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.mvButton();
	}

	@When("User Click on Create Company Button in Sub-menu")
	public void user_click_on_create_company_button_in_sub_menu() {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.createCompBtn();
	}

	@When("User validate Create Company Page Title should be {string}")
	public void user_validate_create_company_page_title_should_be(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver()
				.findElement(By.xpath("//h4[@class='MuiTypography-root MuiTypography-h4 css-10nmv8l']"));
		String actualTitle = LoginHeader.getText();
		System.out.println("Actual Title Value: " + actualTitle);
		String actualTitleCleaned = actualTitle.toLowerCase().replaceAll("\\s", "");
		String expectedTitleCleaned = expectedTitle.toLowerCase().replaceAll("\\s", "");
		Assert.assertEquals(actualTitleCleaned, expectedTitleCleaned, "Title validation failed.");
	}

	@When("User click on Create new  company button")
	public void user_click_on_create_new_company_button() {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.creNewCompBtn();
	}

	@When("User Validate Create Company Title Should be {string}")
	public void user_validate_create_company_title_should_be(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver()
				.findElement(By.xpath("//h6[contains(text(),'Create company')]"));
		String actualTitle = LoginHeader.getText();
		System.out.println("Actual Title Value: " + actualTitle);
		String actualTitleCleaned = actualTitle.toLowerCase().replaceAll("\\s", "");
		String expectedTitleCleaned = expectedTitle.toLowerCase().replaceAll("\\s", "");
		Assert.assertEquals(actualTitleCleaned, expectedTitleCleaned, "Title validation failed.");
	}

	@When("User click on Create company country DropDown")
	public void user_click_on_create_company_country_drop_down() {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.countSeleDrp();
		ccp.countSeleOpt();
	}

	@When("User Select Pan option in Tax Ref DropDown")
	public void user_select_pan_option_in_tax_ref_drop_down() {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		ccp.taxRefDrp();
		ccp.taxRefOpt();
	}

	@When("User Enter Pan Valid Number in Tax ref textfield {string}")
	public void user_enter_pan_valid_number_in_tax_ref_textfield(String Tax) {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.taxRefTxt(Tax);
	}

	@When("User enter Company Name in Company Name textfield {string}")
	public void user_enter_company_name_in_company_name_textfield(String Name) {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.compNameTxt(Name);
	}

	@When("User Select company type in Company Type Dropdwon")
	public void user_select_company_type_in_company_type_dropdwon() {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		ccp.companyTypDrp();
		ccp.companyTypOpt();
	}

	@When("User Enter Company Identification Number {string}")
	public void user_enter_company_identification_number(String Number) {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.compIdentNum(Number);

	}

	@When("User Click on Review button")
	public void user_click_on_review_button() {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.revBtn();
	}

	@When("user Click on Review details check box")
	public void user_click_on_review_details_check_box() {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.checBoxBtn();
	}

	@When("User Click on Create Company button")
	public void user_click_on_create_company_button() {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.crtCompanyBtn();
	}

	@When("User Click on logout button in Sub-Menu")
	public void user_click_on_logout_button_in_sub_menu() {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.mvButton();
		ccp.logOut();
		ccp.yesButton();
	}

	@When("User Close the Browser")
	public void user_close_the_browser() {
		DriverFactory.getDriver().quit();
	}

	@When("User Login With Valid Email {string}")
	public void user_login_with_valid_email(String Email) {
		DriverFactory.getDriver().get("https://frontendnewopt.vercel.app/login");
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.setUserName(Email);

	}

	@When("User Login With Valid password {string}")
	public void user_login_with_valid_password(String password) {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.setPassword(password);
	}

	@When("Users click on login button")
	public void users_click_on_login_button() {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.logIn();
	}

	@When("Users Validate HomePage Title as {string}")
	public void users_validate_home_page_title_as(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver().findElement(By.xpath(
				"//div[@class='MuiBox-root css-6h4npt']/..//p[@class='MuiTypography-root MuiTypography-body1 css-1kpk2c4']"));
		String actualTitle = LoginHeader.getText();
		System.out.println("Actual Title Value: " + actualTitle);
		Assert.assertTrue(actualTitle.trim().equalsIgnoreCase(expectedTitle),
				"Title validation failed. Expected: " + expectedTitle + ", Actual: " + actualTitle);
	}

	@When("User Click on Company button in Company's Public page")
	public void user_click_on_company_button_in_company_s_public_page() {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.companyBtn();
	}

	@When("user Validate Company page Title Should be {string}")
	public void user_validate_company_page_title_should_be(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver()
				.findElement(By.xpath("//h6[@class='MuiTypography-root MuiTypography-h6 css-dzbcka']"));
		String actualTitle = LoginHeader.getText();
		System.out.println("Actual Title Value: " + actualTitle);
		String actualTitleCleaned = actualTitle.toLowerCase().replaceAll("\\s", "");
		String expectedTitleCleaned = expectedTitle.toLowerCase().replaceAll("\\s", "");
		Assert.assertEquals(actualTitleCleaned, expectedTitleCleaned, "Title validation failed.");
	}

	@When("User Click on LoadMore Button")
	public void user_click_on_load_more_button() {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.loadMoreBtn();
	}

	@When("User Click on HealthCart In Company List Page")
	public void user_click_on_health_cart_in_company_list_page() {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.CompanyListBtn();
	}

	@When("User Click on Join Request For HealthCart Company")
	public void user_click_on_join_request_for_health_cart_company() {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.joinReqBtn();
	}

	@When("User Validate Join page Title {string}")
	public void user_validate_join_page_title(String expectedTitle) {
		WebElement LoginHeader = DriverFactory.getDriver()
				.findElement(By.xpath("//h6[contains(text(),'Join Company')]"));
		String actualTitle = LoginHeader.getText();
		System.out.println("Actual Title Value: " + actualTitle);
		String actualTitleCleaned = actualTitle.toLowerCase().replaceAll("\\s", "");
		String expectedTitleCleaned = expectedTitle.toLowerCase().replaceAll("\\s", "");
		Assert.assertEquals(actualTitleCleaned, expectedTitleCleaned, "Title validation failed.");
	}

	@When("user click on join Button")
	public void user_click_on_join_button() {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		ccp.JoinBtn();
	}

	@When("User Click on logout link")
	public void user_click_on_logout_link() {
		CreateCompanyPage ccp = new CreateCompanyPage(DriverFactory.getDriver());
		DriverFactory.getDriver().navigate().back();
		ccp.mvButton();
		ccp.logOut();
		ccp.yesButton();
	}

	@When("users close the browser")
	public void users_close_the_browser() {
		DriverFactory.getDriver().quit();
	}

	@When("Users Login With Valid Email {string}")
	public void users_login_with_valid_email(String string) {
	  
	}

	@When("Users Login With Valid password {string}")
	public void users_login_with_valid_password(String string) {
	  
	}

	@When("Users Click on Login Button")
	public void users_click_on_Login_button() {
	   
	}

	@When("Users Validate HomePage Title is {string}")
	public void users_validate_home_page_title_is(String string) {
	   
	}

	@When("Users Click on Company button in Company's Public page")
	public void users_click_on_company_button_in_company_s_public_page() {
	   
	}

	@When("users Validate Company page Title Should be {string}")
	public void users_validate_company_page_title_should_be(String string) {
	   
	}

	@When("Users Click on LoadMore Button")
	public void users_click_on_load_more_button() {
	   
	}

	@When("Users Click on HealthCart In Company List Page")
	public void users_click_on_health_cart_in_company_list_page() {
	   
	}

	@When("Users Click on WithDraw Request For HealthCart Company")
	public void users_click_on_with_draw_request_for_health_cart_company() {
	    
	}

	@When("Users Validate WithDraw page Title {string}")
	public void users_validate_with_draw_page_title(String string) {
	    
	}

	@When("Users click on WithDraw Button")
	public void users_click_on_with_draw_button() {
	  
	}

	@When("Users Click on LogOut")
	public void users_click_on_log_out() {
	    
	}

	@When("Users Close The Browser")
	public void users_close_The_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}







}
