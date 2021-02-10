package com.salaesforce.qa.pages;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.salesforce.qa.base.BaseClass;

public class LoginPage extends BaseClass {

	@Test
	private void EnterCredentials(String Username, String Password) {
		
		launchBrowser("chrome");
		open("https://login.salesforce.com/");
		WebElement email = getWebElement("xpath=//input[@type='email']");
		type(email, Username);
		WebElement password = getWebElement("xpath=//input[@type='password']");
		type(password, Password);
		WebElement loginButton = getWebElement("xpath=//input[@value='Log In']");
		click(loginButton);

	}

}
