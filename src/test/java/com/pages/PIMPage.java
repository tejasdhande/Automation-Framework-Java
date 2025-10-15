package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.driver.DriverFactory;

public class PIMPage extends HomePage {
	
	@FindBy (xpath = "//a[text()='Add Employee']")
	private WebElement AddEmployeeOption;
	
	@FindBy (xpath = "//input[@name='firstName']")
	private WebElement FirstName;
	
	@FindBy (xpath = "//input[@name='middleName']")
	private WebElement MiddleName;
	
	@FindBy (xpath = "//input[@name='lastName']")
	private WebElement LastName;
	
	@FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement EmployeeId;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement SubmitButton;
	
	public PIMPage() {
		
		PageFactory.initElements(DriverFactory.getInstance().getDriver(), this);
	}
	
	public void addEmpoyee(String fn, String mn, String ln, String empid) {
		
		super.click(AddEmployeeOption, "Add Employee option");
		super.sendKeys(FirstName, "First Name", fn);
		super.sendKeys(MiddleName, "First Name", mn);
		super.sendKeys(LastName, "Last name", ln);
		super.sendKeys(EmployeeId, "Employee Id", empid);
		super.click(SubmitButton, "Submit Name");
	}

}
