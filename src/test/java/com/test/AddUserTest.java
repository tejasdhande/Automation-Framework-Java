package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;
import com.pages.AddUserPage;

public class AddUserTest extends BaseTest {

	private AddUserPage addUserPage;

	@BeforeClass
	public void setUP() {
		addUserPage = new AddUserPage();
	}

	@Test
	public void checkIfUserDropdwonisOpened() {

		addUserPage.clickuserRoleDropdown();
	}

	@Test
	public void checkIfStatusDropdwonisOpened() {

		addUserPage.clickStatusDropdown();
	}
}
