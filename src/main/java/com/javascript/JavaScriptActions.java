package com.javascript;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.driver.DriverFactory;
import com.report.ExtentFactory;

public class JavaScriptActions {
	
	private Logger logger = LogManager.getLogger(JavaScriptActions.class);
	
	public void click(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getInstance().getDriver();  // typecast
			js.executeScript("arguments[0].click()", element);
			
			logger.info("Element is clicked");
			ExtentFactory.getInstance().passTest("Element is clicked using javascript");
			
		} catch (Exception e) {

			logger.error("Exception is occured while clicking on element using javascript");
			ExtentFactory.getInstance().failTest("Exception is occured while clicking on element using javascript");
		}
	}
	
	public void sendKeys(WebElement element, String value) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getInstance().getDriver();  // typecast
			js.executeScript("arguments[0].value = " + " ' " + value + "'", element);
			
			logger.info(value + "is entered using javascript");
			ExtentFactory.getInstance().passTest(value + "is entered using javascript");	
			
		} catch (Exception e) {

			logger.error("Exception is occured while enetring value using javascript");
			ExtentFactory.getInstance().failTest("Exception is occured while entering value using javascript");
		}
	}
	
	public void scrollPageToViewElement(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getInstance().getDriver();  // typecast
			js.executeScript("arguments[0].scrollIntoView(true)", element);
			
			logger.info("Element is visible on screen");
			ExtentFactory.getInstance().passTest("Element is visible on screen");	
			
		} catch (Exception e) {

			logger.error("Exception is occured while scrolling the page" +e.getMessage());
			ExtentFactory.getInstance().failTest("Exception is occured while scrolling the page");
		}
	}
	
	public void scrollTillEndOfPage() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getInstance().getDriver();  // typecast
			js.executeScript("window.scrollTO(0, document.body.scrollHeight)");
			
			logger.info("Page is scrolled till end");
			ExtentFactory.getInstance().passTest("Page is scrolled till end") ;	
			
		} catch (Exception e) {

			logger.error("Exception is occured while scrolling the till page" +e.getMessage());
			ExtentFactory.getInstance().failTest("Exception is occured while scrolling the till page");
		}
	}

}
