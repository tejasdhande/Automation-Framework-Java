package com.waits;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.constants.Constants;
import com.driver.DriverFactory;

public class ImplicitWaitActions {

	private Logger logger = LogManager.getLogger(ImplicitWaitActions.class);

	public void setImplicitWait() {
		try {
			DriverFactory.getInstace().getDriver().manage().timeouts()
					.implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
			
			logger.info("Implicit wait time is set to "+Constants.IMPLICIT_WAIT_TIME);
		} 
		catch (Exception e) {
			logger.error("Error occurred while setting implicit wait"+e.getMessage());
		}
		
		

	}
}
