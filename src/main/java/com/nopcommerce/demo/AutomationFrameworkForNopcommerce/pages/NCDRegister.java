package com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;

public class NCDRegister extends TestBase {
	public NCDRegister() {
		PageFactory.initElements(wd, this);
	}

	Select sc;
	@FindBy(css = "#gender-female")
	private WebElement femaleGenderRadioBtn;

	@FindBy(id = "FirstName")
	private WebElement firstNameInputfield;

	@FindBy(id = "LastName")
	private WebElement lastNameInputfield;

	@FindBy(css = "select[name=\"DateOfBirthDay\"]")
	private WebElement dayOfBirthday;

	@FindBy(css = "select[name=\"DateOfBirthMonth\"]")
	private WebElement monthOfBirthday;

	@FindBy(css = "select[name=\"DateOfBirthYear\"]")
	private WebElement yearOfBirthday;

	@FindBy(css = "#Email")
	private WebElement emailInputField;

	@FindBy(id = "Company")
	private WebElement companyNameInputField;

	@FindBy(css = "#Password")
	private WebElement passwordInputField;

	@FindBy(css = "#ConfirmPassword")
	private WebElement confirmPasswordInputField;

	@FindBy(id = "register-button")
	private WebElement registerBtn;

	private void selectFemaleGenderRadioBtn() {
		femaleGenderRadioBtn.click();
	}

	private void enterFirstName() {
		firstNameInputfield.sendKeys("Tony");
	}

	private void enterLastName() {
		lastNameInputfield.sendKeys("Takkar");
	}

	private void selectDayOfBirth() {
		sc = new Select(dayOfBirthday);
		sc.selectByValue("12");
	}

	private void selectMonthOfBirth() {
		sc = new Select(monthOfBirthday);
		sc.selectByValue("4");
	}

	private void selectYearOfBirth() {
		sc = new Select(yearOfBirthday);
		sc.selectByValue("1980");
	}

	public void enterEmail() {
		emailInputField.sendKeys(enterEmail);
	}

	private void enterCompanyName() {
		companyNameInputField.sendKeys("TonyTakkar");
	}

	private void enterPassword() {
		passwordInputField.sendKeys("Password1");
	}

	private void enterConfirmPassword() {
		confirmPasswordInputField.sendKeys("Password1");
	}

	private Register clickRegisterBtn() {
		registerBtn.submit();
		return new Register();
	}

	public Register registerToPortal() {
		selectFemaleGenderRadioBtn();
		enterFirstName();
		enterLastName();
		selectDayOfBirth();
		selectMonthOfBirth();
		selectYearOfBirth();
		enterEmail();
		enterCompanyName();
		enterPassword();
		enterConfirmPassword();
		return clickRegisterBtn();
	}

	public String randomEmail() {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		int length = 5;
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(index);
			sb.append(randomChar);
		}
		String randomString = sb.toString();
		return randomString + "@gmail.com";
	}

	public String enterEmail = randomEmail();
}
