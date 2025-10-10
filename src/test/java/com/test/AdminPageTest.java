package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.AdminPage;

public class AdminPageTest extends BaseTest{
	
	private AdminPage adminPage;
	
	@BeforeClass
	public void setUp() {
		adminPage = new AdminPage();
	}
	
	@Test
	public void checkIfAdminIsSerching() {
		adminPage.searchTheUsers("Admin");
	}
	
	@Test
	public void checkIfResetFunctionalityIsWorking() {
		adminPage.resetTheUsers();
	}

}
