package com.report;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
public class ExtentReportListener implements ITestListener{
	
	private static Logger logger = LogManager.getFormatterLogger(ExtentReportListener.class);
	
	private ExtentReports  extentReports;
	private ExtentTest extentTest;
	 
	@Override
	public void onTestStart(ITestResult result) {
		//to create a new test and add it into pool
		this.extentTest = extentReports.createTest(result.getName());
		
		// add the above object into thread local pool
		ExtentFactory.getInstance().setExtent(extentTest);
		logger.info("test is added into the pool");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentFactory.getInstance().passTest(result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ExtentFactory.getInstance().getExtentTest().fail("Exceptions Details "+result.getThrowable().getMessage());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentFactory.getInstance().getExtentTest().log(Status.SKIP, "test case" + result.getName()+ "is skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		this.extentReports = ExtentReportManager.setUpExtentReport();  // HTML report will be created
	}

	@Override
	public void onFinish(ITestContext context) {
		this.extentReports.flush();  // executed once all the tests are finished
	}

	
}
