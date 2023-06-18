package com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;

public class NCDStoreCheckoutPaymentMethod extends TestBase {
	public NCDStoreCheckoutPaymentMethod() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "input#paymentmethod_1")
	WebElement creditCardRadioBtn;

	@FindBy(xpath = "(//button[text()='Continue'])[4]")
	WebElement continueBtnForPaymentMethod;

//public void clickRadioBtnForCreditCard() {
//creditCardRadioBtn.click();
//}
	public NCDStoreCheckoutPaymentInfo clickContinueBtnForPaymentMethod() {
		creditCardRadioBtn.click();
		continueBtnForPaymentMethod.click();
		return new NCDStoreCheckoutPaymentInfo();
	}
}
