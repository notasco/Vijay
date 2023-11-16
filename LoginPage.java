package com.instalanes.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



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
	@FindBy(id="mui-4")
	WebElement btnLgin;
	@FindBy(xpath = "//input[@type='password']")
    WebElement btnLgot;
	
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

	public void logOut() {
		btnLgot.click();
	}
}