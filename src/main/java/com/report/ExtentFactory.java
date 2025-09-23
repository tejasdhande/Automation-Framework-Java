package com.report;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.driver.DriverFactory;

public class ExtentFactory {

	ThreadLocal<ExtentTest> extent = new ThreadLocal<ExtentTest>();

	// Single tone design pattern to create only one object to use thorughout the
	// project

	private ExtentFactory() {

	}

	private static ExtentFactory instance;

	// public getter method

	public static ExtentFactory getInstance() {
		if(instance == null) {
			 instance = new ExtentFactory();
		}
		return instance;
	}

	public void setExtent(ExtentTest obj) {
		extent.set(obj);
	}

	public ExtentTest getExtentTest() {
		return extent.get();
	}

	public void removeTest() {
		extent.remove();
	}

	public static String captureApplicationScreenshot() {

		TakesScreenshot screenshot = (TakesScreenshot) DriverFactory.getInstance().getDriver();// type cast the driver
																								// obj to
																								// takesscreenshot
																								// interface

		File file = screenshot.getScreenshotAs(OutputType.FILE);

		byte[] fileContent = null;

		try {
			fileContent = FileUtils.readFileToByteArray(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Base64.getEncoder().encodeToString(fileContent);
	}

	public static void clickPass(String buttonName) {
		getInstance().getExtentTest().pass(buttonName + "Button is clicked");

	}

	public static void clickFail(String buttonName) {
		getInstance().getExtentTest().fail("Error occured while clicking on " + buttonName);

	}

	public static void sendKeysPass(String value, String elementName) {

		getInstance().getExtentTest().pass(value + "is entered in " + elementName);
	}

	public static void sendKeysFail(String value, String elementName) {

		getInstance().getExtentTest()
				.fail("Error occured while entering value in " + value + " in text box " + elementName);
	}

	public static void passTest(String msg) {
		getInstance().getExtentTest().log(Status.PASS, MarkupHelper.createLabel(msg, ExtentColor.GREEN),
				MediaEntityBuilder.createScreenCaptureFromBase64String(captureApplicationScreenshot()).build());

	}

	public static void failTest(String msg) {
		getInstance().getExtentTest().fail(msg,
				MediaEntityBuilder.createScreenCaptureFromBase64String(captureApplicationScreenshot()).build());
	}

}
