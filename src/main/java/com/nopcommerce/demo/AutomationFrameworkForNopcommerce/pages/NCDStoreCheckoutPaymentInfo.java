package com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;

public class NCDStoreCheckoutPaymentInfo extends TestBase {
	public NCDStoreCheckoutPaymentInfo() {
		PageFactory.initElements(wd, this);
	}

	Select sc;
	@FindBy(css = "#CreditCardType")
	private WebElement creditCardSelectField;

	@FindBy(css = "#CardholderName")
	private WebElement cardHolderNameInputField;

	@FindBy(css = "#CardNumber")
	private WebElement cardNumberInputField;

	@FindBy(css = "#ExpireMonth")
	private WebElement expirationMonthSelectField;

	@FindBy(css = "#ExpireYear")
	private WebElement expirationYearSelectField;

	@FindBy(css = "#CardCode")
	private WebElement cardCodeInputField;

	@FindBy(xpath = "(//button[text()='Continue'])[5]")
	private WebElement continueBtnForPaymentInfo;

	private void selectCreditCardType() {
		sc = new Select(creditCardSelectField);
		sc.selectByVisibleText("Visa");
	}

	private void enterCardHolderName() {
		cardHolderNameInputField.sendKeys("Tony");
	}

	private void enterCardNumber() {
		cardNumberInputField.sendKeys("4556443540848324");
	}

	private void selectExpirationMonth() {
		sc = new Select(expirationMonthSelectField);
		sc.selectByVisibleText("05");
	}

	private void selectExpirationYear() {
		sc = new Select(expirationYearSelectField);
		sc.selectByValue("2026");
	}

	private void enterCardCode() {
		cardCodeInputField.sendKeys("456");
	}

	private NCDStoreCheckoutConfirmOrder clickContinueBtnForPaymentInfo() {
		continueBtnForPaymentInfo.click();
		return new NCDStoreCheckoutConfirmOrder();
	}

	public NCDStoreCheckoutConfirmOrder successfulPaymentInfoSubmission() {
		selectCreditCardType();
		enterCardHolderName();
		enterCardNumber();
		selectExpirationMonth();
		selectExpirationYear();
		enterCardCode();
		return clickContinueBtnForPaymentInfo();
	}
}
