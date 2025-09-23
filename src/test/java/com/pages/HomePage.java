package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;
import com.driver.DriverFactory;

public class HomePage extends BasePage {

	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement AdminPage;

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement PIMPage;

	@FindBy(xpath = "//span[text()='Leave']")
	private WebElement LeavePage;

	@FindBy(xpath = "//span[text()='Time']")
	private WebElement TimePage;

	@FindBy(xpath = "//span[text()='Recruitment']")
	private WebElement RecruitmentPage;

	@FindBy(xpath = "//span[text()='My Info']")
	private WebElement MyInfoPage;


	public HomePage() {

		PageFactory.initElements(DriverFactory.getInstance().getDriver(), this); // intializing webelemts
	}

	public void CheckAdminPage() {

		super.click(AdminPage, "Admin page");
	}

	public void CheckLeavePage() {

		super.click(LeavePage, "Leave page");
	}

}
