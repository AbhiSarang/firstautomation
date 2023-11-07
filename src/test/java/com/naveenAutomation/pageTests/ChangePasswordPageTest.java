package com.naveenAutomation.pageTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenAutomation.base.SideBar;
import com.naveenAutomation.base.TestBase;
import com.naveenAutomation.pages.AccountPage;
import com.naveenAutomation.pages.ChangePasswordPage;
import com.naveenAutomation.pages.LoginPage;

public class ChangePasswordPageTest extends TestBase {

	LoginPage loginPage;
	AccountPage accountPage;
	ChangePasswordPage changePass;

	@BeforeMethod
	public void intialize() {
		intialisation();
		loginPage = new LoginPage();

	}

	@Test
	public void checkLogoutPage() {
		accountPage = loginPage.SubmitLogin("green2023@gmail.com", "123456789");
		accountPage = new AccountPage();
		changePass = accountPage.clickUpdatePassBtn(SideBar.PASSWORD);

		String passPageTxt = changePass.getPassPageTxt();
		Assert.assertEquals(passPageTxt, "Change Password", "Invalid choice");
		changePass = new ChangePasswordPage();

		changePass.enterPass("987654321");
		changePass.enterConfirmPass("987654321");
		accountPage = changePass.continuePassChange();

		Assert.assertEquals(accountPage.getSuccessMessage(), "Success: Your password has been successfully updated.",
				"Info not updated");
	}

	@AfterMethod
	public void endSession() {
		tearDown();
	}
}
