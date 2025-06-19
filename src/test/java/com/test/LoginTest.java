package com.test;

import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.LoginPage;
import com.properties.TestDataLoader;

public class LoginTest extends BaseTest {
	
	@Test
	public void loginWithValidUsernameAndValidPassword() {
		
		LoginPage loginPage = new LoginPage();
		
		loginPage.loginToApplication(TestDataLoader.getInstance().getUsername(), TestDataLoader.getInstance().getPassword());
		
		
		
	}

}
