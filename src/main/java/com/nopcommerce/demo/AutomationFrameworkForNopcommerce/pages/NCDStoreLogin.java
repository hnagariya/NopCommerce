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

	private void enterPassword() {
		passwordInputField.sendKeys("Password1");
	}

	private NCDStore clickLoginBtn() {
		loginBtn.submit();
		return new NCDStore();
	}

	public NCDStore loginToPortal(String string) {
		enterEmail(string);
		enterPassword();
		return clickLoginBtn();
	}

}
