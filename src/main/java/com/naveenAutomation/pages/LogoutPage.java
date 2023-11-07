package com.naveenAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenAutomation.base.TestBase;

public class LogoutPage extends TestBase {

	public LogoutPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(xpath = "//aside[@id='column-right']//following-sibling::div//a[13]")
	WebElement logoutBtn;
	
	@FindBy(css = "#content>h1")
	WebElement logoutTxt;
	
	@FindBy(css = "#content>div>div>a")
	WebElement continueBtn;
	
	public String getLogoutText() {
		logoutBtn.click();
		return logoutTxt.getText();
	}
	
	public HomePage continueLogout() {
		continueBtn.click();
		return new HomePage();
	}
}
