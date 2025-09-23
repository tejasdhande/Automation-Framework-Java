package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.LoginPage;
import com.properties.TestDataLoader;

public class LoginTest extends BaseTest {
	private LoginPage loginPage;

	@BeforeClass
	public void setUp() {
		loginPage = new LoginPage();
	}
	
	@Test
	public void loginWithValidUsernameAndValidPassword() {
		
		
		loginPage.loginToApplication(TestDataLoader.getInstance().getUsername(), TestDataLoader.getInstance().getPassword());
		
		
		
	}

}
