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

public class ChangePassword {
	private WebDriver driver;

	public ChangePassword(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='email']")
	WebElement txtUser;
	@FindBy(xpath = "//input[@type='password']")
	WebElement txtPass;
	@FindBy(xpath = "//button[@tabindex='0']/..//button[text()='Log in']")
	WebElement btnLgin;
	@FindBy(xpath = "//button[@tabindex='0']/..//div[text()='MV']")
	WebElement mvBtn;
	@FindBy(xpath = "//li[@tabindex='-1']/..//li[text()='Settings']")
	WebElement settBtn;
	@FindBy(xpath = "//li[@tabindex='-1']/..//li[text()='Change Password']")
	WebElement chngPasBtn;
	@FindBy(xpath = "//h6[text()='Change password']/..//button[text()='Change']")
	WebElement chngpasBtn2;
	@FindBy(xpath = "//label[text()='Current password']/..//input[@name='currentPassword']")
	WebElement currPasTxt;
	@FindBy(xpath = "//label[text()='New password']/..//input[@name='newPassword']")
	WebElement newPassTxt;
	@FindBy(xpath = "//label[text()='Confirm password']/..//input[@name='confirmPassword']")
	WebElement confPassTxt;
	@FindBy(xpath = "//button[@tabindex='0']/..//button[text()='Change Password']")
	WebElement chngPassBtn;
	@FindBy(xpath = "//li[@tabindex='-1']/..//li[text()='Logout']")
	WebElement btnLgot;
	@FindBy(xpath = "//button[@tabindex='0']/..//button[text()='Yes']")
	WebElement ysBtn;

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

	public void mvButton() {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@tabindex='0']/..//div[text()='MV']")));
		element.click();
	}

	public void changePasswordBtn() {
		chngPasBtn.click();
	}

	public void settingBtn() {
		settBtn.click();
	}

	public void changePasswordBtn2() {
		chngpasBtn2.click();
	}

	public void currentPasswordTxt(String password) {
		currPasTxt.sendKeys(password);
	}

	public void newPasswordTxt(String password) {
		newPassTxt.sendKeys(password);
	}

	public void conformPassTxt(String password) {
		confPassTxt.sendKeys(password);
	}

	public void changPasswordBtn() {
		chngPassBtn.click();

	}

	public void logOut() {
		btnLgot.click();

	}

	public void yesButton() {

		ysBtn.click();
	}

}
