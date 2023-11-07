package com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;

public class NCDStoreCheckoutSuccessful extends TestBase {
	public NCDStoreCheckoutSuccessful() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
	WebElement textForsuccessfulOrder;

	public String getTextForSuccessfulOrder() {
		return textForsuccessfulOrder.getText();
	}

}
