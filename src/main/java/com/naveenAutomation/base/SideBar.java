package com.naveenAutomation.base;

public enum SideBar {

	MY_ACCOUNT("My Account"),
	EDIT_ACCOUNT("Edit Account"), 
	PASSWORD("Password"), 
	ADDRESS_BOOK("Address Book"),
	WISH_LIST("Wish List"),
	ORDER_HISTORY("Order History"), 
	DOWNLOADS("Downloads"),
	RECURRING_PAYMENTS("Recurring payments"), 
	REWARD_POINTS("Reward Points"), 
	RETURNS("Returns"),
	TRANSACTIONS("Transactions"),
	NEWSLETTER("Newsletter"), 
	LOGOUT("Logout");

	String sideBar;

	SideBar(String sideBar) {
		this.sideBar = sideBar;

	}

	public String getSideBar() {
		return sideBar;
	}
}
