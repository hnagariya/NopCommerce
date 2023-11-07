package com.nopcommerce.demo.AutomationFrameworkForNopcommerce.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;
import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages.NCDAccountPAge;
import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages.NCDStoreLogin;

public class NCDStoreLoginTest extends TestBase {
	
	private NCDStoreLogin loginPage;
	private NCDAccountPAge accountPage;
	
	public void launchBrowser() {
		initialisation();
		loginPage = new NCDStoreLogin();
	}
	
	@Test
	public void validateIfUserCanLoginWithValidCredentials() {
		accountPage = loginPage.loginToPortal("peter@email.com","peter123");
		Assert.assertEquals(accountPage.getAccountBannerText(), "My Account", "User able to login successfully");
	}

}
