package com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;

public class NCDStoreDesktops extends TestBase {

	public NCDStoreDesktops() {
		PageFactory.initElements(wd, this);
	}

	// @FindBy (xpath="(//button[text()='Add to cart'])[2]")
	@FindBy(css = "div.item-grid div:first-of-type div:first-of-type div:nth-of-type(2) div:nth-of-type(3) div:nth-of-type(2) button:first-of-type")
	WebElement addToCartBuildYourOwnComputer;

	public NCDStoreBuildYourOwnComputer clickAddTOCartBuildYourOwnComputer() {
		addToCartBuildYourOwnComputer.click();
		return new NCDStoreBuildYourOwnComputer();
	}

}
