package com.naveenAutomation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenAutomation.base.SideBar;
import com.naveenAutomation.base.TestBase;

public class AccountPage extends TestBase {

	public AccountPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#content>h2:first-of-type")
	WebElement myAccountText;

	@FindBy(css = "div.alert-success")
	WebElement acccountInfoUpdateSuccessMessage;

	// Success: Your account has been successfully updated.

	@FindBy(xpath = "//a[text()='Edit your account information']")
	WebElement editYourInfoLink;

//	@FindBy(xpath = "//aside[@id='column-right']//following-sibling::div//a[3]")
//	WebElement updatePasswordBtn;
//	
//	@FindBy(xpath = "//aside[@id='column-right']//following-sibling::div//a[12]")
//	WebElement newsletterBtn;
//
//	@FindBy(xpath = "//aside[@id='column-right']//following-sibling::div//a[10]")
//	WebElement returnBtn;
	List<WebElement> sideBar = wd.findElements(By.xpath("//aside[@id='column-right']//div//a"));

	public void sideBarMenu(SideBar sideMenuSelected) {

		for (int i = 0; i < sideBar.size(); i++) {
			System.out.println(sideBar.get(i).getText().toString());
			if (sideBar.get(i).getText().toString().equals(sideMenuSelected.getSideBar())) {
				sideBar.get(i).click();
				break;

			}

		}
	}

	public String getMyAccountText() {
		return myAccountText.getText();
	}

	public EditPage clickEditInfoLink(SideBar sideMenuSelected) {
		sideBarMenu(sideMenuSelected);
		return new EditPage();
	}

	public String getSuccessMessage() {
		return acccountInfoUpdateSuccessMessage.getText();
	}

	public ChangePasswordPage clickUpdatePassBtn(SideBar sideMenuSelected) {
		sideBarMenu(sideMenuSelected);
		return new ChangePasswordPage();
	}

	public NewsletterPage clickNewsLetterBtn(SideBar sideMenuSelected) {
		sideBarMenu(sideMenuSelected);
		return new NewsletterPage();
	}

	public ReturnPage clickReturnBtn(SideBar sideMenuSelected) {
		sideBarMenu(sideMenuSelected);
		return new ReturnPage();
	}

}
