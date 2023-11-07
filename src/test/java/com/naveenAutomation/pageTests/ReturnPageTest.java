package com.naveenAutomation.pageTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenAutomation.base.SideBar;
import com.naveenAutomation.base.TestBase;
import com.naveenAutomation.pages.AccountPage;
import com.naveenAutomation.pages.LoginPage;
import com.naveenAutomation.pages.ReturnPage;

public class ReturnPageTest extends TestBase {

	LoginPage loginPage;
	AccountPage accountPage;
	ReturnPage returnPage;
	
	@BeforeMethod
	public void intialize() {
		intialisation();
		loginPage = new LoginPage();

	}
	
	@Test
	public void subscribeNewsletter() {
		accountPage = loginPage.SubmitLogin("green2023@gmail.com", "123456789");
		
//		accountPage = new AccountPage();
		accountPage.clickReturnBtn(SideBar.RETURNS);
		returnPage = new ReturnPage();
		String returnPagetext = returnPage.getReturnPageTxt();
		Assert.assertEquals(returnPagetext, "Product Returns", "Invalid choice of page");
		
		returnPage.clickReturnContinueBtn();
		Assert.assertEquals(accountPage.getMyAccountText(),"My Account","Info not updated");
	}
	@AfterMethod
	public void endSession() {
		tearDown();
	}
}
