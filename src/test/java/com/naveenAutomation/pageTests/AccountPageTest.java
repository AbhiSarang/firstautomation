package com.naveenAutomation.pageTests;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenAutomation.base.SideBar;
import com.naveenAutomation.base.TestBase;
import com.naveenAutomation.pages.AccountPage;
import com.naveenAutomation.pages.EditPage;
import com.naveenAutomation.pages.LoginPage;

public class AccountPageTest extends TestBase{

	LoginPage loginPage;
	AccountPage accountPage;
	EditPage editPage;

	@BeforeMethod
	public void launch() {
		intialisation();
		loginPage = new LoginPage();

	}

	@Test
	public void validateUserCanUpdatePersonalInfo() {
		accountPage = loginPage.SubmitLogin("green2023@gmail.com", "123456789");
		editPage = accountPage.clickEditInfoLink(SideBar.EDIT_ACCOUNT);
		editPage.enterFName("yellow");
		accountPage = editPage.clickSubmitBtn();
		Assert.assertEquals(accountPage.getSuccessMessage(), "Success: Your account has been successfully updated.",
				"Info not updated");
	}
	@Test
	public void validateDisplay() {
		System.out.println("Test1");
	}
	@Test
	public void test1() {
		System.out.println(new Date());
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		System.out.println(timeStamp);
	}
	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}
}
