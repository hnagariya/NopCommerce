package com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;

public class NCDAccountPAge extends TestBase{
	
	public NCDAccountPAge() {
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(css = "#content>h2:first-of-type")
	WebElement myAccountBanner;
	
	public String getAccountBannerText() {
		return myAccountBanner.getText();
	}

}
