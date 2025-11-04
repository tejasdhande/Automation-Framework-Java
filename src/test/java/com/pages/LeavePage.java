package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;
import com.driver.DriverFactory;

public class LeavePage extends BasePage {
	
	@FindBy (xpath = "(//input[@placeholder=\"yyyy-dd-mm\"])[1]")
	private WebElement fromDateDropdown;
	
	@FindBy (xpath = "(//div[@class=\"oxd-calendar-date\"])[5]")
	private WebElement startDate;
	
	@FindBy (xpath = "(//div[@class=\"oxd-calendar-date\"])[6]")
	private WebElement endDate;
	
	@FindBy (xpath = "(//input[@placeholder=\"yyyy-dd-mm\"])[2]")
	private WebElement toDateDropdown;
	
	@FindBy (xpath = "(//div[text()='-- Select --'])[1]")
	private WebElement showLiveWithStatusDropdown;
	
	@FindBy (xpath = "//div[@role=\"listbox\"]/child::div[3]")
	private WebElement DropdownOptions;
	
	@FindBy (xpath = "(//div[text()='-- Select --'])[2]")
	private WebElement leaveTypeDropdown;
	
	@FindBy (xpath = "//input[@placeholder=\"Type for hints...\"]")
	private WebElement employeeName;
	
	@FindBy (xpath = "(//div[text()='-- Select --'])[2]")
	private WebElement subUnitDropdown;
	
	@FindBy (xpath = "(//input[@type=\"checkbox\"])[1]")
	private WebElement includePastEmployeeSlider;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement SubmitButton;
	
	@FindBy (xpath = "//div[@aria-live=\"assertive\"]")
	private WebElement statusMessage;
	
	public LeavePage() {
		
		PageFactory.initElements(DriverFactory.getInstance().getDriver(), this);
	
	}
	
	public void selectTheStartDate() {
		
		super.click(fromDateDropdown, "from date drodown");
		super.click(startDate, "Start Date");
		super.click(toDateDropdown, "to date drodown");
		super.click(endDate, "End Date");
		super.click(showLiveWithStatusDropdown, "Show leave with status dropdown");
		super.click(DropdownOptions, "dropdown options");
		super.click(leaveTypeDropdown, "Leave Type Dropdown");
		super.click(DropdownOptions, "Leave Dropdown options");
		super.sendKeys(employeeName, "Employee name", "a");
		super.click(DropdownOptions, "Dropdown options");
		super.click(subUnitDropdown, "Sub Unit Dropdown");
		super.click(DropdownOptions, "Dropdown options");
		//super.click(includePastEmployeeSlider, "Past Employee slider");
		super.click(SubmitButton, "Submit Button");
		super.elementDisplay(statusMessage, "Status Message");

	}
	
}
