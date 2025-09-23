package com.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.driver.BrowserFactory;
import com.driver.DriverFactory;
import com.properties.ConfigLoader;
import com.properties.TestDataLoader;

public class BaseTest {

	@BeforeSuite
	public void setUp() {

		WebDriver driver = BrowserFactory.createBrowserInstance(ConfigLoader.getInstance().getPropertyValue("browser"));

		DriverFactory.getInstance().setDriver(driver);
		
		DriverFactory.getInstance().getDriver().get(TestDataLoader.getInstance().getAppURL());

	}
	
	@AfterSuite
	public void TearDown() {
		DriverFactory.getInstance().getDriver().quit();
	}
}