package com.alert;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

import com.driver.DriverFactory;
import com.report.ExtentFactory;

public class AlertActions {

	private Logger logger = LogManager.getLogger(AlertActions.class);

	private Alert alert; // created reference variable for alert interface

	public void switchToAlert() {

		try {
			alert = DriverFactory.getInstace().getDriver().switchTo().alert();
			logger.info("Switched to alert");
			ExtentFactory.getInstance().passTest("Switched to alert"); // for report html

		} catch (NoAlertPresentException e) {
			logger.error("Exception occured while switching to alert");
			ExtentFactory.getInstance().failTest("Exception occured while switching to alert");

		}

	}

	public void acceptAlert() {
		try {
			this.alert.accept();

			logger.info("Clicked on OK button");
			ExtentFactory.getInstance().passTest("Clicked on OK button");
		} catch (Exception e) {
			logger.error("Exception occured while clicking on OK button");
			ExtentFactory.getInstance().failTest("Exception occured while clicking on OK button");

		}
	}

	public void cancelAlert() {
		try {
			this.alert.dismiss();

			logger.info("Clicked on Cancel button");
			ExtentFactory.getInstance().passTest("Clicked on Cancel button");
		} catch (Exception e) {
			logger.error("Exception occured while clicking on Cancel button");
			ExtentFactory.getInstance().failTest("Exception occured while clicking on Cancel button");

		}
	}
}
