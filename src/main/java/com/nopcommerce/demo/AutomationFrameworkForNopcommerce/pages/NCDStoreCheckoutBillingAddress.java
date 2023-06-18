package com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;

public class NCDStoreCheckoutBillingAddress extends TestBase {
	Select sc;

	public NCDStoreCheckoutBillingAddress() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#BillingNewAddress_CountryId")
	private WebElement selectCountryField;

	@FindBy(css = "select#BillingNewAddress_StateProvinceId")
	private WebElement selectStateField;

	@FindBy(css = "#BillingNewAddress_City")
	private WebElement cityInputField;

	@FindBy(css = "#BillingNewAddress_Address1")
	private WebElement address1InputField;

	@FindBy(css = "#BillingNewAddress_ZipPostalCode")
	private WebElement postalCodeInputField;

	@FindBy(css = "#BillingNewAddress_PhoneNumber")
	private WebElement phoneNumberInputField;

	@FindBy(xpath = "(//button[text()='Continue'])[1]")
	private WebElement continueBtn;

	private void selectCountry() {
		sc = new Select(selectCountryField);
		sc.selectByValue("1");
	}

	private void selectState() {
		sc = new Select(selectStateField);
		sc.selectByVisibleText("Massachusetts");
	}

	private void enterCity() {
		cityInputField.sendKeys("Boston");
	}

	private void enterAddress1() {
		address1InputField.sendKeys("10 Handley crescent");
	}

	private void enterPostalCode() {
		postalCodeInputField.sendKeys("02108");
	}

	private void enterPhoneNumber() {
		phoneNumberInputField.sendKeys("4567890123");
	}

	private NCDStoreCheckoutShippingMethod clickContinueBtn() {
		continueBtn.click();
		return new NCDStoreCheckoutShippingMethod();
	}

	public NCDStoreCheckoutShippingMethod checkoutForBillingAddress() {
		selectCountry();
		selectState();
		enterCity();
		enterAddress1();
		enterPostalCode();
		enterPhoneNumber();
		return clickContinueBtn();
	}
}
