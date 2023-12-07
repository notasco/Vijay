package com.instalanes.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.instalanes.factory.DriverFactory;

public class CreateCompanyPage {
	private WebDriver driver;

	public CreateCompanyPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='email']")
	WebElement txtUser;
	@FindBy(xpath = "//input[@type='password']")
	WebElement txtPass;
	@FindBy(xpath = "//button[text()='Log in']/..//button[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth css-1gpn6yo']")
	WebElement btnLgin;
	@FindBy(xpath = "//div[text()='MV']/..//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-1aw4uza']")
	WebElement mvBtn;
	@FindBy(xpath = "//li[@tabindex='-1']/..//li[text()='Logout']")
	WebElement btnLgot;
	@FindBy(xpath = "//button[@tabindex='0']/..//button[text()='Yes']")
	WebElement ysBtn;
	@FindBy(xpath = "//li[@tabindex='-1']/..//li[text()='Create Company']")
	WebElement crComBtn;
	@FindBy(xpath = "//button[@tabindex='0']/..//button[text()='Create new Company']")
	WebElement CreNewComp;
	@FindBy(xpath = "//label[text()='Country']/..//div[@tabindex='0']")
	WebElement conDrpBtn;
	@FindBy(xpath = "//li[@tabindex='0']/..//li[text()='India']")
	WebElement conDrpOpt;
	@FindBy(xpath = "//label[text()='Tax ref']/..//div[@tabindex='0']")
	WebElement taxRefDrpBtn;
	@FindBy(xpath = "//li[@tabindex='-1']/..//li[text()='PAN']")
	WebElement taxRefOptBtn;
	@FindBy(xpath = "//label[text()='Tax ref#']/..//input[@name='tax_number']")
	WebElement taxRefTxt;
	@FindBy(xpath = "//label[text()='Company name']/..//input[@name='company_name']")
	WebElement comNamTxt;
	@FindBy(xpath = "//label[text()='Company type']/..//div[@tabindex='0']")
	WebElement comTypDrpBtn;
	@FindBy(xpath = "//li[@tabindex='0']/..//li[text()='Private limited']")
	WebElement comTypOptBtn;
	@FindBy(xpath = "//label[text()='Company identification number']/..//input[@name='company_identification_number']")
	WebElement comIdNumTxt;
	@FindBy(xpath = "//button[@tabindex='0']/..//button[text()='Review']")
	WebElement RevBtn;
	@FindBy(xpath = "//label[@class='MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-1jaw3da']")
	WebElement checBoxBtn;
	@FindBy(xpath = "//button[text()='CREATE COMPANY']/.. //button[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-18dfnzq']")
	WebElement creCompBtn;
	@FindBy(xpath = "//div[text()='Companies']")
	WebElement companyBtn;
	@FindBy(xpath = "//button[text()='Load more']/..//button[@tabindex='0']")
	WebElement loadBtn;
	@FindBy(xpath = "//div[11]//div[1]//button[1]") // (//button[@type='button'])[15]
	WebElement compyNameBtn;
	@FindBy(xpath = "//button[text()='Join']")
	WebElement joinReqBtn;
	@FindBy(xpath = "//button[text()='join']/..//button[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-18dfnzq']")
	WebElement joinbtn;

	public void setUserName(String Email) {
		txtUser.sendKeys(Email);

	}

	public void setMobileName(String Mobile) {
		txtUser.sendKeys(Mobile);

	}

	public void setPassword(String password) {
		txtPass.sendKeys(password);
	}

	public void logIn() {
		btnLgin.click();
	}

	public void mvButton() {
		WebElement logoutLink = DriverFactory.getDriver().findElement(By.xpath("//div[@style='display: flex; align-items: center;']/..//div[text()='JB']"));

		// Scroll into view if necessary
		((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].scrollIntoView(true);", logoutLink);

		// Click using JavascriptExecutor
		((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();", logoutLink);
	}

	public void createCompBtn() {
		crComBtn.click();
	}

	public void creNewCompBtn() {
		WebElement createButton = DriverFactory.getDriver()
				.findElement(By.xpath("//button[@tabindex='0']/..//button[text()='Create new Company']"));

		// Scroll into view if necessary
		((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].scrollIntoView(true);",
				createButton);

		// Click using JavascriptExecutor
		((JavascriptExecutor) DriverFactory.getDriver()).executeScript("arguments[0].click();", createButton);
	}

	public void countSeleDrp() {
		conDrpBtn.click();
	}

	public void countSeleOpt() {
		conDrpOpt.click();
	}

	public void taxRefDrp() {
		taxRefDrpBtn.click();
	}

	public void taxRefOpt() {
		taxRefOptBtn.click();
	}

	public void taxRefTxt(String Tax) {
		taxRefTxt.sendKeys(Tax);
	}

	public void compNameTxt(String Name) {
		comNamTxt.sendKeys(Name);
	}

	public void companyTypDrp() {
		comTypDrpBtn.click();
	}

	public void companyTypOpt() {
		comTypOptBtn.click();
	}

	public void compIdentNum(String Number) {
		comIdNumTxt.sendKeys(Number);
	}

	public void revBtn() {
		RevBtn.click();
	}

	public void checBoxBtn() {
		checBoxBtn.click();
	}

	public void crtCompanyBtn() {
		creCompBtn.click();
	}

	public void companyBtn() {
		companyBtn.click();
	}

	public void loadMoreBtn() {
		loadBtn.click();
	}

	public void CompanyListBtn() {
		compyNameBtn.click();
	}

	public void joinReqBtn() {
		joinReqBtn.click();
	}

	public void JoinBtn() {
		joinbtn.click();
	}

	public void logOut() {
		btnLgot.click();

	}

	public void yesButton() {

		ysBtn.click();
	}

}