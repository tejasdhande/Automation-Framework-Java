package com.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	public WebDriver createBrowserInstance(String browserName) {
		
		WebDriver driver = null;
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			 driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Chrome")) {
			 driver = new ChromeDriver();
		}
		return driver;
		
	}
}
