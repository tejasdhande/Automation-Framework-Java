package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;
import com.driver.DriverFactory;

public class AddUserPage extends BasePage{
	
	@FindBy(xpath="//label[text()='User Role']/following::div[contains(@class, 'oxd-select-wrapper')][1]")
			private WebElement userRoleDropdown;
	
	@FindBy(xpath = "//label[text()='Status']/following::div[contains(@class, 'oxd-select-wrapper')][1]")
	private WebElement statusDropdown;
	
	
	
	public AddUserPage() {
		PageFactory.initElements(DriverFactory.getInstance().getDriver(),this);
	}
	
	public void clickuserRoleDropdown() {
		super.click(userRoleDropdown, "UserRole Dropdown");
	}
	
	public void clickStatusDropdown() {
		super.click(statusDropdown, "Status Dropdown");
	}

}
