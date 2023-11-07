package com.naveenAutomation.pageTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenAutomation.base.TestBase;
import com.naveenAutomation.pages.AccountPage;
import com.naveenAutomation.pages.HomePage;
import com.naveenAutomation.pages.LoginPage;
import com.naveenAutomation.pages.LogoutPage;

public class LogoutPageTest extends TestBase{

	LoginPage loginPage;
	AccountPage accountPage;
	LogoutPage logoutPage;
	HomePage homePage;
	
	@BeforeMethod
	public void intialize() {
		intialisation();
		loginPage = new LoginPage();
	}
	@Test
	public void checkLogoutPage() {
		accountPage = loginPage.SubmitLogin("green2023@gmail.com", "123456789");
		logoutPage = new LogoutPage();
		String logoutPageText = logoutPage.getLogoutText();
		Assert.assertEquals(logoutPageText, "Account Logout", "Account is not logged out");
		homePage = logoutPage.continueLogout();
		String homePageTitle = wd.getTitle();
		Assert.assertEquals(homePageTitle, "Your Store", "Account is not logged out");
	}
	@AfterMethod
	public void endSession() {
		tearDown();
	}
}
