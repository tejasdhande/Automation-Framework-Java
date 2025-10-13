package com.test;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.driver.DriverFactory;
import com.pages.AddUserPage;
import com.report.ExtentFactory;

public class AddUserTest extends BaseTest {
	
	private AddUserPage addUserPage;

	@BeforeMethod
	public void setUP(){
		addUserPage = new AddUserPage();

	}

	@Test
	public void checkIfNewUserAdded() throws InterruptedException {
		
		addUserPage.addNewUser("t", "Qwert@123", "admin142");
		Thread.sleep(Duration.ofSeconds(10));
		  String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		    String actualUrl = DriverFactory.getInstance().getDriver().getCurrentUrl();
		    
		    
		    if (!actualUrl.equalsIgnoreCase(expectedUrl)) {
		        ExtentFactory.failTest("Test Failed: not all required fields selected");
		        Assert.fail("Expected URL was: " + expectedUrl + " but got: " + actualUrl);
		    }
		
	}
}
