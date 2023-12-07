package com.instalanes.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	private static WebDriver driver;
	public static WebDriver createDriver(String browser) {
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			DriverFactory.setDriver(driver);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			DriverFactory.setDriver(driver);
			break;
		default:
			throw new IllegalArgumentException("Unsupported browser: " + browser);
		}

		return driver;
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			throw new IllegalStateException("WebDriver is not initialized. Call createDriver() first.");
		}
		return driver;
	}

	public static WebDriver setDriver(WebDriver newDriver) {
		driver = newDriver;
		return newDriver;
	}
	
}