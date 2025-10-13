package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;
import com.driver.DriverFactory;

public class AddUserPage extends BasePage{
	
	@FindBy(xpath="(//div[@class=\"oxd-select-wrapper\"]/descendant::i)[1]")
	private WebElement userRoleDropdown;
	
	@FindBy (xpath = "//div[@role=\"listbox\"]/child::div[2]")
	private WebElement AdminOptionFromDropdown;
	
	@FindBy (xpath = "//input[@placeholder='Type for hints...']")
	private WebElement EmployeeNameTextBox;
	
	@FindBy (xpath = "(//div[@class=\"oxd-select-wrapper\"]/descendant::i)[2]")
	private WebElement StatusDropdown;
	
	@FindBy (xpath = "//div[@role=\"listbox\"]/child::div[2]")
	private WebElement EnabledOptionFromDropdown;
	
	@FindBy (xpath = "(//input[contains(@class,'oxd')])[2]")
	private WebElement UsernameTextBox;
	
	@FindBy (xpath = "(//input[contains(@class,'oxd')])[3]")
	private WebElement PasswordTextBox;
	
	@FindBy (xpath = "(//input[contains(@class,'oxd')])[4]")
	private WebElement ConfirmPasswordTextBox;
	
	@FindBy (xpath = "//button[text()=' Save ']")
	private WebElement SaveButton;
	
	@FindBy (xpath = "//button[text()=' Cancel ']")
	private WebElement CancelButton;
	
	@FindBy (xpath = "//div[@role='listbox']/child::div[2]")
	private WebElement EmployeeNameHint;
	
	//Initializing element
	public AddUserPage() {
		PageFactory.initElements(DriverFactory.getInstance().getDriver(),this);
	}
	
	public void addNewUser(String empname, String password, String username) {
		
		super.click(userRoleDropdown, "User Role Dropdown");
		super.click(AdminOptionFromDropdown, "Admin option");
		super.sendKeys(EmployeeNameTextBox, "Employee name", empname);
		super.click(EmployeeNameHint, "First Option");
		super.click(StatusDropdown, "Status Dropdown");
		super.click(EnabledOptionFromDropdown,"Enable option");
		super.sendKeys(UsernameTextBox, "User name", username);
		super.sendKeys(PasswordTextBox, "Password", password);
		super.sendKeys(ConfirmPasswordTextBox, "Confirm Password", password);
		super.click(SaveButton, "Save button");
	}

}