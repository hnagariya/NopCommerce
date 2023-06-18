package com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;

public class NCDStoreCheckoutShippingMethod extends TestBase {
	public NCDStoreCheckoutShippingMethod() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(xpath = "(//button[text()='Continue'])[3]")
	WebElement continueBtnForShippingMethod;

	public NCDStoreCheckoutPaymentMethod clickContinueBtnForShipping() {
		continueBtnForShippingMethod.click();
		return new NCDStoreCheckoutPaymentMethod();
	}
}
