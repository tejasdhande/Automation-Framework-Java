package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.base.BaseTest;
import com.pages.HomePage;
import com.report.ExtentFactory;
import com.report.ExtentReportManager;

public class HomePageTest extends BaseTest {

	private HomePage homePage;

	@BeforeClass
	public void setUP() {
		homePage = new HomePage();
	}

	@Test
	public void checkIfAdminPageisOpened() {

		homePage.CheckAdminPage();

	}

}
