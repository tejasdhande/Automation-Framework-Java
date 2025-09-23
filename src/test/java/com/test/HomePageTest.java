package com.test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.base.BaseTest;
import com.pages.HomePage;
import com.report.ExtentFactory;
import com.report.ExtentReportManager;
public class HomePageTest extends BaseTest {
	
	@Test
	public void checkIfAdminPageisOpened() {
		
		HomePage homePage = new HomePage();
		homePage.CheckAdminPage();
		

		
		
		
	}

}
