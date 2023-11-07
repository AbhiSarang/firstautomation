package com.naveenAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenAutomation.base.TestBase;

public class ReturnPage extends TestBase {

	public ReturnPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(css = "#content>h1")
	WebElement returnPageTxt;
	
	@FindBy(css = "#content>div>div>a")
	WebElement returnPageContinueBtn;
	
	public String getReturnPageTxt() {
		return returnPageTxt.getText();
	}
	
	public AccountPage clickReturnContinueBtn() {
		returnPageContinueBtn.click();
		return new AccountPage();
	}
}
