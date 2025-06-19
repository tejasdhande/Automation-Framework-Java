package com.waits;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.constants.Constants;
import com.driver.DriverFactory;
import com.report.ExtentFactory;

public class ExplicitWaitActions {

	Logger logger = LogManager.getLogger(ExplicitWaitActions.class);

	public void waitForElementToBePresent(WebElement element, String elementName) {

		try {
			WebDriverWait wait = new WebDriverWait(DriverFactory.getInstace().getDriver(),
					Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));

			wait.until(ExpectedConditions.visibilityOf(element));

			logger.info(elementName + "is available on screen");

		} catch (Exception e) {
			logger.error("Exception occured while waiting for the element to be Visible" + e.getMessage());
			ExtentFactory.getInstance().failTest("Exception occured while waiting for the element to be Visible");
		}

	}

	public void waitForElementToBeClickable(WebElement element, String elementName) {

		try {
			WebDriverWait wait = new WebDriverWait(DriverFactory.getInstace().getDriver(),
					Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));

			wait.until(ExpectedConditions.elementToBeClickable(element));
			logger.info(elementName + "is Clickable on screen");

		} catch (Exception e) {
			logger.error("Exception occured while waiting for the element to be Clickable" + e.getMessage());
			ExtentFactory.getInstance().failTest("Exception occured while waiting for the element to be Clickable");
		}

	}

}
