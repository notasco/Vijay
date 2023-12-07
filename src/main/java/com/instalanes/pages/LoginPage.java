package com.instalanes.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.instalanes.factory.DriverFactory;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='email']")
	WebElement txtUser;
	@FindBy(xpath = "//input[@type='password']")
	WebElement txtPass;
	@FindBy(xpath= "//button[text()='Log in']/..//button[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth css-1gpn6yo']")
	WebElement btnLgin;
	@FindBy(xpath = "//div[text()='Carrier']")
	WebElement CarrBtn;
	@FindBy(xpath = "//li[text()='Vehicles']")
	WebElement vehBtn;
	@FindBy(xpath = "//li[text()='Drivers']")
	WebElement drivBtn;
	@FindBy(xpath = "//div[text()='My Company']")
	WebElement myComBtn;
	@FindBy(xpath = "//li[text()='Documents']")
	WebElement docBtn;
	@FindBy(xpath="//div[text()='MV']/..//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-1aw4uza']")
	WebElement mvBtn;
	@FindBy(xpath = "//li[@tabindex='-1']/..//li[text()='Logout']")
	WebElement btnLgot;
	@FindBy(xpath="//button[@tabindex='0']/..//button[text()='Yes']")
	WebElement ysBtn;

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
	public void mvButton() {
		mvBtn.click();
	}
	public void carrerButton() {
		CarrBtn.click();
	}

	public void vehcileButton() {
		vehBtn.click();
	}

	public void driverButton() {
		drivBtn.click();
	}

	public void myCompanyButton() {
		myComBtn.click();
	}

	public void documentButton() {
		docBtn.click();
	}

	public void logOut() {
		btnLgot.click();

	}

	public void yesButton() {

		ysBtn.click();
	}

	public String getPassword() {
		WebElement passwordField = DriverFactory.getDriver().findElement(By.xpath("//input[@type='password']")); // Replace "password" with the actual ID of the password field
        return passwordField.getAttribute("value");
	
	}

	public String getUserName() {
		
		 WebElement userNameField = DriverFactory.getDriver().findElement(By.xpath("//input[@type='email']")); // Replace "username" with the actual ID of the username field
	        return userNameField.getAttribute("value");
	}
}