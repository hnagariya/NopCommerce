package com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;

public class NCDStoreLogin extends TestBase {
	public NCDStoreLogin() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "input#Email")
	private WebElement emailInputField;

	@FindBy(css = "input#Password")
	private WebElement passwordInputField;

	@FindBy(css = "button.login-button")
	private WebElement loginBtn;

	private void enterEmail(String string) {
		emailInputField.sendKeys(string);
	}

	private void enterPassword(String password) {
		passwordInputField.sendKeys();
	}

	private void clickLoginBtn() {
		loginBtn.submit();
	}

	public NCDAccountPAge loginToPortal(String email,String password) {
		enterEmail(email);
		enterPassword(password);
		clickLoginBtn();
		return new NCDAccountPAge();
		
	}

}
