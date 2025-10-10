package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;
import com.driver.DriverFactory;

public class AdminPage extends BasePage{
	@FindBy (xpath = "//button[text()=' Add ']")
	private WebElement AddButton;
	
	@FindBy (xpath = "//div[@class=\'oxd-table-filter\']/descendant::input[1]")
	private WebElement UsernameTextBox;
	
	@FindBy (xpath = "//div[@class='oxd-table-filter']/descendant::i[2]")
	private WebElement UserRoleDropdown;
	
	@FindBy (xpath = "//div[@class=\'oxd-table-filter\']/descendant::input[2]")
	private WebElement EmployeeNameTextBox;
	
	@FindBy (xpath = "//div[@class=\'oxd-table-filter\']/descendant::i[3]")
	private WebElement StatusDropdown;
	
	@FindBy (xpath = "//div[@class='oxd-table-filter']/descendant::button[2]")
	private WebElement ResetButton;
	
	@FindBy (xpath = "//div[@class='oxd-table-filter']/descendant::button[3]")
	private WebElement SearchButton;
	
	@FindBy (xpath = "//div[@role=\"listbox\"]/child::div[2]")
	private WebElement AdminOptionFromDropdown;
	
	
	public AdminPage() {
		
		PageFactory.initElements(DriverFactory.getInstance().getDriver(), this);
	}
	
	
	public void searchTheUsers(String username) {
		
		super.sendKeys(UsernameTextBox, " User name textbox", username);
		super.click(UserRoleDropdown, "User role dropdown");
		super.click(AdminOptionFromDropdown, "Admin option");
		super.click(SearchButton, "Search Button");
		
	}
	
	public void resetTheUsers() {
		super.click(ResetButton, "Reset Button");
		if(UsernameTextBox.equals(null)) {
			System.out.println("Reset button is working");
		}
	}
	
	public void clickAddButton() {
		super.click(AddButton, "Add Button");
	}
	
	
}
