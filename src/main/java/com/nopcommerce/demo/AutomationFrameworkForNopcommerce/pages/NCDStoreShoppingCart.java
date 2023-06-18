package com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;

public class NCDStoreShoppingCart extends TestBase {

	public NCDStoreShoppingCart() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "input#termsofservice")
	private WebElement termsOfServiceCheckBox;

	@FindBy(css = "button#checkout")
	private WebElement continueBtn;

	private NCDStoreShoppingCart checkTermsOfService() {
		termsOfServiceCheckBox.click();
		return new NCDStoreShoppingCart();
	}

	private NCDStoreCheckoutBillingAddress clickContinueBtn() {
		continueBtn.click();
		return new NCDStoreCheckoutBillingAddress();
	}

	public NCDStoreCheckoutBillingAddress checkOutForShoppingCart() {
		checkTermsOfService();
		return clickContinueBtn();
	}

}
