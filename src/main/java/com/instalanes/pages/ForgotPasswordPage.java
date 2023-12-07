package com.instalanes.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.instalanes.factory.DriverFactory;

public class ForgotPasswordPage {
	private WebDriver driver;

	public ForgotPasswordPage(WebDriver driver) {

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
	@FindBy(xpath = "//a[text()='Forgot password?']")
	WebElement forgPasBtn;
	@FindBy(xpath = "//label[text()='Enter your registered email address']/..//input[@name='email']")
	WebElement regEmailTxt;
	@FindBy(xpath = "//button[@tabindex='-1']/..//p[text()='Phone']")
	WebElement phoneBtn;
	@FindBy(xpath = "//div[@tabindex='0']/..//em[text()='Code']")
	WebElement regMobCode;
	@FindBy(xpath = "//li[contains(text(),'+91')]")
	WebElement mobCode;
	@FindBy(xpath = "//input[@name='phoneNumber']/..//span[text()='Enter your registered mobile number']")
	WebElement regmobileNumTxt;
	@FindBy(xpath = "//button[@tabindex ='0']/..//button[text()='Generate OTP']")
	WebElement genOtpBtn;
	@FindBy(xpath = "//div[@tabindex ='-1']/..//input[@id='name']")
	WebElement otpTxt;
	@FindBy(xpath = "//button[@tabindex ='0']/..//button[text()='Verify']")
	WebElement otpVerBtn;
	@FindBy(xpath = "//label[text()='New Password']/..//input[@name='New Password']")
	WebElement newPassTxt;
	@FindBy(xpath = "//label[text()='Confirm Password']/..//input[@name='Confrom Password']")
	WebElement confpassTxt;
	@FindBy(xpath = "//button[@tabindex='0']/..//button[text()='Set up Password']")
	WebElement setUpPasBtn;
	@FindBy(xpath = "//button[@tabindex='0']/..//button[text()='Login']")
	WebElement navLogBtn;
	@FindBy(xpath = "//button[@tabindex='0']/..//button[text()='Sign up']")
	WebElement navSignupBtn;

	public void launchUrl(String URL) {
		driver.get(URL);
	}

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

	public void forPasswordBtn() {
		forgPasBtn.click();
	}

	public void regEmailText(String Email) {
		regEmailTxt.sendKeys(Email);
	}

	public void mvButton() {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(30));
		WebElement element = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//button[@tabindex='0']/..//div[text()='MV']")));
		element.click();
	}

	public void logOut() {
		btnLgot.click();

	}

	public void yesButton() {

		ysBtn.click();
	}

	public void geneOtpButton() {
		genOtpBtn.click();
	}

	public void otpTxt(String otp) {
		switchToIframe();
		enterOTP(otp, "//div[@tabindex ='-1']/..//input[@id='name']");
		switchToDefaultContent();

	}

	public void otpVer() {

		otpVerBtn.click();

	}

	private void switchToIframe() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		try {
			// Wait for the iframe to be present
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
			driver.switchTo().frame("name");
			System.out.println("Switched to iframe successfully.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to switch to iframe.");
		}
	}

	private void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	private void enterOTP(String otp, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			WebElement elementInIframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
			elementInIframe.sendKeys(otp);
			System.out.println("Entered OTP in the iframe.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to enter OTP in the iframe.");
		}
	}

	public void newPasswordTxt(String password) {
		newPassTxt.sendKeys(password);
	}

	public void confoPasswordTxt(String password) {
		confpassTxt.sendKeys(password);
	}

	public void setupPasswordBtn() {
		setUpPasBtn.click();
	}

	public void phoneButton() {
		phoneBtn.click();
	}

	public void codeDrp() {
		regMobCode.click();
	}

	public void codeDrpOpt() {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(30));
		WebElement mobileCountryCode = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'+91')]")));
		mobileCountryCode.click();
	}

	public void mobTxt(String Mobile) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(30));
		WebElement mobTxtFe = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//label[text()='Enter your registered mobile number']/..//input[@name='phoneNumber']")));
		mobTxtFe.sendKeys(Mobile);

	}

	public void navLoginPgBtn() {
		navLogBtn.click();
	}

	public void navSignupPgBtn() {
		navSignupBtn.click();
	}

}
