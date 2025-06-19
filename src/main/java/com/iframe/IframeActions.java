package com.iframe;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.constants.Constants;
import com.driver.DriverFactory;
import com.report.ExtentFactory;

public class IframeActions {

	private Logger logger = LogManager.getLogger(IframeActions.class);

	public void waitForIframeAndSwitch(String idOrName) {

		try {
			WebDriverWait wait = new WebDriverWait(DriverFactory.getInstace().getDriver(),
					Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));

			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
			logger.info("Switched to iframe");
			ExtentFactory.getInstance().passTest("Switched to iframe");

		} catch (Exception e) {
			logger.error("Error occured while switch to Iframe");
			ExtentFactory.getInstance().failTest("Error occurred while switching to frame");

		}

	}

	public void waitForIframeAndSwitch(int index) {

		try {
			WebDriverWait wait = new WebDriverWait(DriverFactory.getInstace().getDriver(),
					Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));

			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
			logger.info("Switched to iframe");
			ExtentFactory.getInstance().passTest("Switched to iframe");

		} catch (Exception e) {
			logger.error("Error occured while switch to Iframe");
			ExtentFactory.getInstance().failTest("Error occurred while switching to frame");

		}

	}

	public void switchBackToDefaultContent() {

		try {
			DriverFactory.getInstace().getDriver().switchTo().defaultContent();
			logger.info("Switched to Default Content");
			ExtentFactory.getInstance().passTest("Switched to Default Content");

		} catch (Exception e) {
			logger.error("Error occured while switching to Default content");
			ExtentFactory.getInstance().failTest("Error occurred while switching to default content ");
		}
	}
}
