package com.naveenAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenAutomation.base.TestBase;

public class ChangePasswordPage extends TestBase{
	
	public ChangePasswordPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(xpath = "//h1[text()='Change Password']")
	WebElement changePassPageTxt;
	

	@FindBy(css = "#input-password")
	WebElement inputPassword;
	
	@FindBy(css = "#input-confirm")
	WebElement inputConfirmPass;
	
	@FindBy(css = "input[type='submit']")
	WebElement submitBtn;
	
	public String getPassPageTxt() {
		return changePassPageTxt.getText();
	}
	public void enterPass(String pass) {
		inputPassword.sendKeys(pass);
	}

	public void enterConfirmPass(String confirmPass) {
		inputConfirmPass.sendKeys(confirmPass);
	}
	
	public AccountPage continuePassChange() {
		submitBtn.click();
		return new AccountPage();
	}
}
