package com.naveenAutomation.pageTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenAutomation.base.SideBar;
import com.naveenAutomation.base.TestBase;
import com.naveenAutomation.pages.AccountPage;
import com.naveenAutomation.pages.LoginPage;
import com.naveenAutomation.pages.NewsletterPage;

public class NewsletterPageTest extends TestBase{

	LoginPage loginPage;
	AccountPage accountPage;
	NewsletterPage newsletterPage;
	
	@BeforeMethod
	public void intialize() {
		intialisation();
		loginPage = new LoginPage();

	}
	
	@Test
	public void subscribeNewsletter() {
		accountPage = loginPage.SubmitLogin("green2023@gmail.com", "123456789");
		
		
		newsletterPage=accountPage.clickNewsLetterBtn(SideBar.NEWSLETTER);
//		newsletterPage = new NewsletterPage();
		String newsletterPageTxt = newsletterPage.getPageTxt();
		Assert.assertEquals(newsletterPageTxt, "Newsletter Subscription", "Invalid choice of page");
		
		
		newsletterPage.clickSubscribeBtn();

		accountPage=newsletterPage.submitForSubscription();

		Assert.assertEquals(accountPage.getSuccessMessage(), "Success: Your newsletter subscription has been successfully updated!",
				"Info not updated");
	}

	@AfterMethod
	public void endSession() {
		tearDown();
	}
}
