package com.base;

import org.openqa.selenium.WebElement;

import com.alert.AlertActions;
import com.iframe.IframeActions;
import com.javascript.JavaScriptActions;
import com.report.ExtentFactory;
import com.waits.ExplicitWaitActions;

public class BasePage {

	protected AlertActions alertActions;

	protected IframeActions iframeActions;

	protected JavaScriptActions javaScriptActions;

	protected ExplicitWaitActions explicitWaitActions;

	protected BasePage() {

		alertActions = new AlertActions();

		iframeActions = new IframeActions();

		javaScriptActions = new JavaScriptActions();

		explicitWaitActions = new ExplicitWaitActions();

	}

	public void click(WebElement element, String elementName) {

		explicitWaitActions.waitForElementToBeClickable(element, elementName);

		element.click();

		ExtentFactory.getInstance().passTest(elementName + " is clicked");

	}

}
