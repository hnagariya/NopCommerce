package com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;

public class NCDStoreCheckoutConfirmOrder extends TestBase {
	public NCDStoreCheckoutConfirmOrder() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(xpath = "//button[text()='Confirm']")
	WebElement confirmBtn;

	public NCDStoreCheckoutSuccessful clickConfirmBtn() {
		confirmBtn.click();
		return new NCDStoreCheckoutSuccessful();
	}
}
