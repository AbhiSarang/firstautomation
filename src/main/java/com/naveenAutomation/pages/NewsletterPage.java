package com.naveenAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenAutomation.base.TestBase;

public class NewsletterPage extends TestBase {
	
	public NewsletterPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(css = "#content>h1")
	WebElement newsletterTxt;
	
	@FindBy(xpath = "//input[@name='newsletter' and @value='1']")
	WebElement subscribeBtn;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement continuebtn;
	
	public String getPageTxt() {
		return newsletterTxt.getText();
	}
	
	public void clickSubscribeBtn() {
		subscribeBtn.click();
	}
	
	public AccountPage submitForSubscription() {
		continuebtn.click();
		return new AccountPage();
	}

}
