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

public class SignupPage {
	private WebDriver driver;

	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='By signing up, user agree to Instalanes ']/..//a[text()=' terms ']")
	WebElement termBtn;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1b2of2b']/..//a[text()='Already registered? Log in']")
	WebElement alRegBtn;
	@FindBy(xpath = "//a[normalize-space()='policy']")
	WebElement poliBtn;
	@FindBy(xpath = "//input[@type='email']")
	WebElement txtUser;
	@FindBy(xpath = "//input[@type='password']")
	WebElement txtPass;
	@FindBy(xpath = "//button[text()='Log in']/..//button[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth css-1gpn6yo']")
	WebElement btnLgin;
	@FindBy(xpath = "//li[@tabindex='-1']/..//li[text()='My Profile']")
	WebElement ProfBtn;
	@FindBy(id = "outlined-firstName")
	WebElement fsNme;
	@FindBy(id = "outlined-lastName")
	WebElement lsNme;
	@FindBy(id = "outlined-select-role")
	WebElement orgSele;
	@FindBy(xpath = "//li[text()='Logistic service provider']")
	WebElement orgSeleOp;
	@FindBy(xpath = "//div[contains(@class,'css-19vq1m8')]//div[contains(@role,'button')]")
	WebElement codeDrp;
	@FindBy(xpath = "//li[normalize-space()='+91']")
	WebElement codeOpt;
	@FindBy(id = "outlined-phone")
	WebElement phNum;
	@FindBy(xpath = "//button[normalize-space()='Verify']")
	WebElement verbtn;
	@FindBy(xpath = "//div[@tabindex ='-1']/..//input[@id='name']")
	WebElement otpTxt;
	@FindBy(xpath = "//button[text()='Verify']/..//button[@id='mui-4']")
	WebElement otpVerBtn;
	@FindBy(id = "outlined-email")
	WebElement emailTxt;
	@FindBy(xpath = "//button[text()='Verify']/..//button[@name='emailVerify']")
	WebElement emVerbtn;
	@FindBy(xpath = "//div[@tabindex ='-1']/..//input[@id='name']")
	WebElement emOtpTxt;
	@FindBy(xpath = "//button[text()='Verify']/..//button[@id='mui-5']")
	WebElement emOtpVerBtn;
	@FindBy(id = "outlined-password")
	WebElement passTxt;
	@FindBy(id = "mui-2")
	WebElement sigBttn;
	@FindBy(xpath = "//div[text()='MV']/..//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-1aw4uza']")
	WebElement mvBtn;
	@FindBy(xpath = "//li[@tabindex='-1']/..//li[text()='Logout']")
	WebElement btnLgot;
	@FindBy(xpath = "//button[@tabindex='0']/..//button[text()='Yes']")
	WebElement ysBtn;

	public void termButton() {
		termBtn.click();
	}

	public void allRegLoginBtn() {
		alRegBtn.click();
	}

	public void policyButton() {
		poliBtn.click();
	}

	public void setFrstName(String Firstname) {
		fsNme.sendKeys(Firstname);
	}

	public void setLstName(String Lastname) {
		lsNme.sendKeys(Lastname);
	}

	public void dpOrg() {
		orgSele.click();
	}

	public void dpOrgSel() {
		orgSeleOp.click();
	}

	public void codeDp() {
		codeDrp.click();
	}

	public void codeDpSel() {
		codeOpt.click();

	}

	public void phNum(String number) {
		phNum.sendKeys(number);
	}

	public void verPhn() {
		verbtn.click();
	}

	public void otpPhn(String otp) {
		switchToIframe();
		enterOTP(otp, "//div[@tabindex ='-1']/..//input[@id='name']");
		switchToDefaultContent();

	}

	public void otpVerPh() {

		otpVerBtn.click();

	}

	public void emailTxt(String email) {
		emailTxt.sendKeys(email);
	}

	public void emailVer() {
		emVerbtn.click();
	}

	public void emailOtp(String otp) {
		switchToIframe();
		enterOTP(otp, "//div[@tabindex ='-1']/..//input[@id='name']");
		switchToDefaultContent();
	}

	public void emailOtpVer() {

		emOtpVerBtn.click();

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

	public void passTxt(String password) {
		passTxt.sendKeys(password);
	}

	public void signup() {
		sigBttn.click();
	}

	public void launchUrl(String URL) {
		driver.get(URL);
	}

	public void setUserName(String Email) {
		txtUser.sendKeys(Email);

	}

	public void setPassword(String password) {
		txtPass.sendKeys(password);
	}

	public void logIn() {
		btnLgin.click();
	}

	public void profileButoon() {
		ProfBtn.click();
	}

	public void mvButton() {
		mvBtn.click();
	}

	public void logOut() {
		btnLgot.click();
	}

	public void yesButton() {

		ysBtn.click();
	}
}
