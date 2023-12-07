package com.instalanes.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.instalanes.factory.DriverFactory;

public class VehiclesPage {

	private WebDriver driver;

	public VehiclesPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='email']")
	WebElement txtUser;
	@FindBy(xpath = "//input[@type='password']")
	WebElement txtPass;
	@FindBy(id = "mui-4")
	WebElement btnLgin;
	@FindBy(xpath = "//div[@class='MuiToolbar-root MuiToolbar-gutters MuiToolbar-regular css-gvcdkc']/..//div[text()='Carrier']")
	WebElement carrerBtn;
	@FindBy(xpath = "//li[@name='Vehicles']")
	WebElement vehicleBtn;
	@FindBy(xpath = "//button[text()='Vehicle']/..//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1ocnqjz']")
	WebElement addvehicleBtn;
	@FindBy(xpath = "//input[@name='registrationNumber']")
	WebElement VehicleNum;
	@FindBy(xpath = "//div[@id='vehicleStatus']")
	WebElement vehicleStatus;
	@FindBy(xpath = "//li[text()='Available']")
	WebElement vehicleStatusOption;
	@FindBy(xpath = "//label[text()='Vehicle type']/..//div[@id='Vehicle-type']")
	WebElement vehicleType;
	@FindBy(xpath = "//li[text()='Trailer']")
	WebElement vehicleTypeoption;
	@FindBy(xpath = "//label[text()='Vehicle body']/..//div[@id='vehicleBody']")
	WebElement vehicleBody;
	@FindBy(xpath = "//li[text()='Closed']")
	WebElement vehicleBodyOption;
	@FindBy(xpath = "//label[text()='Vehicle spec']/..//div[@id='vehicleSpec']")
	WebElement vehicleSpec;
	@FindBy(xpath = "//li[text()='MXL']")
	WebElement vehicleSpecOption;
	@FindBy(xpath = "//label[text()='Vehicle category']/..//div[@id='Vehicle-type']")
	WebElement vehicleCategory;
	@FindBy(xpath = "//li[text()='HCV']")
	WebElement vehicleCategoryOption;
	@FindBy(xpath = "//label[text()='Size Unit']/..//div[@id='SizeUnit']")
	WebElement sizeUnit;
	@FindBy(xpath = "//li[text()='FT']")
	WebElement sizeUnitOption;
	@FindBy(xpath = "//label[text()='Size']/..//div[@id='vehicleSize']")
	WebElement sizeDropDown;
	@FindBy(xpath = "//li[text()='27']")
	WebElement sizeDropDownOption;
	@FindBy(xpath = "//div[@id='VehicleWeight']")
	WebElement weightUnit;
	@FindBy(xpath = "//li[text()='MT']")
	WebElement weightUnitOption;
	@FindBy(xpath = "//label[text()='Weight']/..//div[@id='vehicleSize']")
	WebElement weightDropDown;
	@FindBy(xpath = "//li[text()='25']")
	WebElement weightDropDownOption;
	@FindBy(xpath = "//label[text()='Brand']/..//div[@id='vehicleBody']")
	WebElement brandDrp;
	@FindBy(xpath = "//li[text()='Eicher']")
	WebElement brandDrpOpt;
	@FindBy(xpath = "//label[text()='Make model']/..//input[@id='outlined-size-small']")
	WebElement makeModel;
	@FindBy(xpath = "//label[text()='Fuel type']/..//div[@id='vehicleSize']")
	WebElement fuelDrp;
	@FindBy(xpath = "//li[text()='Petrol']")
	WebElement fuelDrpOpt;
	@FindBy(xpath = "//label[text()='Tyres']/..//div[@id='Vehicle-type']")
	WebElement tyreDrp;
	@FindBy(xpath = "//li[text()='8']")
	WebElement tyreDropOpt;
	@FindBy(xpath = "//label[text()='State']/..//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall MuiAutocomplete-inputRoot css-hiksqc']")
	WebElement StateTxt;
	@FindBy(xpath="//label[text()='State']/..//input[@id='free-solo-2-demo']")
	WebElement stateSele;
	@FindBy(xpath = "//label[text()='State']/..//input[@value='Tamil Nadu']")
	WebElement StateSel;
	@FindBy(xpath = "//label[text()='City']/..//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall MuiAutocomplete-inputRoot css-hiksqc']")
	WebElement cityTxt;
	@FindBy(xpath="//label[text()='City']/..//input[@id='free-solo-2-demo']")
	WebElement citySele;
	@FindBy(xpath = "//label[text()='City']/..//input[@value='Chennai']")
	WebElement citySel;
	@FindBy(xpath = "//label[text()='Legal ownership']/..//div[@id='legalOwnership']")
	WebElement legOwnerDrp;
	@FindBy(xpath = "//li[text()='Owner']")
	WebElement legOwnerDrpOpt;
	@FindBy(xpath = "//label[text()='Registration date']/..//input[@id='mui-31']")
	WebElement dateSelect;
	@FindBy(xpath = "//div[text()='Marketplace']/..//input[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")
	WebElement marketPlaceBtn;
	@FindBy(xpath = "//button[@id='mui-22']")
	WebElement saveBtn;

	public void usPwTxt(String username, String password) {

		txtUser.sendKeys(username);
		txtPass.sendKeys(password);
	}

	public void loginBtn() {
		btnLgin.click();
	}

	public void carrer() {
		carrerBtn.click();
	}

	public void vehicleButton() {
		vehicleBtn.click();

	}

	public void addVehicle() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", addvehicleBtn);
	}

	public void vehicleNum(String VehicleNumber) {
		String xpath = String.format("//input[@name='registrationNumber' and @value='%s']", VehicleNumber);
	    WebElement vehicleNumElement = driver.findElement(By.xpath(xpath));
	    vehicleNumElement.sendKeys(VehicleNumber);
	}

	public void vehicleSts() {
		vehicleStatus.click();
	}

	public void vehicleStsOpt() {
		vehicleStatusOption.click();
	}

	public void vehicleTy() {
		vehicleType.click();
	}

	public void vehicleTyOpt() {
		vehicleTypeoption.click();
	}

	public void vehicleBdy() {
		vehicleBody.click();
	}

	public void vehicleBdyOpt() {
		vehicleBodyOption.click();
	}

	public void vehicleSpec() {
		vehicleSpec.click();
	}

	public void vehicleSpecOpt() {
		vehicleSpecOption.click();
	}

	public void vehicleCate() {
		vehicleCategory.click();
	}

	public void vehicleCateOpt() {
		vehicleCategoryOption.click();
	}

	public void sizeUnit() {
		sizeUnit.click();
	}

	public void sizeUnitOpt() {
		sizeUnitOption.click();
	}

	public void sizeDrp() {
		sizeDropDown.click();
	}

	public void sizeDrpOpt() {
		sizeDropDownOption.click();
	}

	public void weightUnit() {
		weightUnit.click();
	}

	public void weightUnitOpt() {
		weightUnitOption.click();
	}

	public void weightDrp() {
		weightDropDown.click();
	}

	public void weightDrpOpt() {
		weightDropDownOption.click();
	}

	public void brandDrp() {
		brandDrp.click();
	}

	public void brandDrpOpt() {
		brandDrpOpt.click();
	}

	public void makeModel(String Model) {
		makeModel.sendKeys(Model);
	}

	public void fuelType() {
		fuelDrp.click();
	}

	public void fuelTypDrp() {
		fuelDrpOpt.click();
	}

	public void tyres() {
		tyreDrp.click();
	}

	public void tyresDrp() {
		tyreDropOpt.click();
	}

	public void state() {
		StateTxt.click();

	}
public void stateSele(String state) {
	stateSele.sendKeys(state);
}
	public void stateSle() {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(30));
		WebElement stateElement = wait.until(ExpectedConditions.elementToBeClickable(StateSel));
		stateElement.click();
	}

	public void city() {
		cityTxt.click();

	}
public void citySel(String city) {
	citySele.sendKeys(city);
}
	public void citySele() {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(30));
		WebElement stateElement = wait.until(ExpectedConditions.elementToBeClickable(citySel));
		stateElement.click();
		citySel.click();
	}

	public void legalOwnerShip() {
		legOwnerDrp.click();
	}

	public void legalOwnerShipOpt() {
		legOwnerDrpOpt.click();
	}

	public void regDate(String date) {
		dateSelect.sendKeys(date);
	}

	public void marketPlace() {
		marketPlaceBtn.click();
	}

	public void saveButton() {
		saveBtn.click();
	}
}
