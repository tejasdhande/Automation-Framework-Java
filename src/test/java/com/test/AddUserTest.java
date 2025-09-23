package com.test;

import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.AddUserPage;

public class AddUserTest extends BaseTest {

	@Test(dependsOnMethods = {"checkIfAdminPageisOpened"})
	public void checkIfUserDropdwonisOpened() {
		AddUserPage ad = new AddUserPage();

		ad.clickuserRoleDropdown();
	}

	@Test
	public void checkIfStatusDropdwonisOpened() {
		AddUserPage ad = new AddUserPage();

		ad.clickStatusDropdown();
	}
}
