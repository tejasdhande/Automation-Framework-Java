package com.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.driver.BrowserFactory;
import com.driver.DriverFactory;
import com.properties.ConfigLoader;
import com.properties.TestDataLoader;

public class BaseTest {

	@BeforeSuite
	public void setUp() {

		WebDriver driver = BrowserFactory.createBrowserInstance(ConfigLoader.getInstance().getPropertyValue("browser"));

		DriverFactory.getInstace().setDriver(driver);
		
		DriverFactory.getInstace().getDriver().get(TestDataLoader.getInstance().getAppURL());

	}
	
	@AfterSuite
	public void TearDown() {
		DriverFactory.getInstace().getDriver().quit();
	}
}
