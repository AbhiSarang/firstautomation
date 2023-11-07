package com.naveenAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenAutomation.base.TestBase;

public class HomePage extends TestBase {

	public HomePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(xpath = "//title[text()='Your Store']")
	WebElement homePageTxt;
	
	public String getHomePageText() {
		return homePageTxt.getText();
	}
}
