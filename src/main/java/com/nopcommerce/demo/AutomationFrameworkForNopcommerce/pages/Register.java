
package com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;

public class Register extends TestBase {

	public Register() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "div.result")
	WebElement registerSuccessMessage;

	@FindBy(css = "div.buttons a ")
	WebElement continueBtn;

	public String getTextForSuccessfulRegister() {
		return registerSuccessMessage.getText();
	}

	public NCDStore clickContinueBtnAfterRegister() {
		continueBtn.click();
		return new NCDStore();
	}

}
