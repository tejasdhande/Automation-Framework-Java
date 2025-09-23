package com.driver;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();  // it will create a pool where all driver objects placed
	
	private DriverFactory() {
		
		
	}
	
	private static DriverFactory instance = new DriverFactory();  // static object used in project
	
	public static DriverFactory getInstance() {
		 return instance;
	}
	
	public void setDriver(WebDriver driverObj) {
		driver.set(driverObj);
	}
	
	public WebDriver getDriver() {
		return driver.get();
		
	}

}
