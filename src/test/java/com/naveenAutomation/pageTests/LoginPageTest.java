package com.naveenAutomation.pageTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenAutomation.base.TestBase;
import com.naveenAutomation.pages.AccountPage;
import com.naveenAutomation.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	AccountPage accountPage;

	@BeforeMethod
	public void launch() {
		intialisation();
		loginPage = new LoginPage();
		
	}

	@Test
	public void validateUserCanLoginWithValidCredentials() {
		accountPage=loginPage.SubmitLogin("green2023@gmail.com","123456789");
		Assert.assertEquals(accountPage.getMyAccountText(), "My Account", "User not logged in");
	}
	
	@Test
	public void validateUserCanNotLoginWithInValidCredentials() {
		loginPage.SubmitLogin("green2023@gmail.com","1234567890");
		Assert.assertEquals(loginPage.getAlertText(), "Warning: No match for E-Mail Address and/or Password.", "User logged in");
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}
}


