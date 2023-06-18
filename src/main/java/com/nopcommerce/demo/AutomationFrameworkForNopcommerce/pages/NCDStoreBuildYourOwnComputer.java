package com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;

public class NCDStoreBuildYourOwnComputer extends TestBase {
	Select sc;

	public NCDStoreBuildYourOwnComputer() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#product_attribute_input_1 select")
	private WebElement processorSelection;

	@FindBy(css = "#product_attribute_input_2 select")
	private WebElement ramSelection;

	@FindBy(css = "input#product_attribute_3_6")
	private WebElement hddRadioBtnFor320GB;

	@FindBy(css = "input#product_attribute_4_8")
	private WebElement osRadioBtnForVistaHome;

	@FindBy(css = "input#product_attribute_4_8")
	private WebElement softwareSelectionForMIcrosoftOffice;

	@FindBy(id = "add-to-cart-button-1")
	private WebElement addToCartBtn;

	@FindBy(xpath = "//p[text()='The product has been added to your ']")
	WebElement addTOCartSuccessMessage;

	@FindBy(css = "span.close")
	WebElement addToCartSuccessMessageCloseBtn;

	@FindBy(css = "span.cart-label")
	WebElement shoppingCartBtn;

	private void selectProcessor() {
		sc = new Select(processorSelection);
		sc.selectByValue("2");
	}

	private void selectRam() {
		sc = new Select(ramSelection);
		sc.selectByValue("3");
	}

	private NCDStoreBuildYourOwnComputer selectHDDRadioBtnFor320GB() {
		hddRadioBtnFor320GB.click();
		return new NCDStoreBuildYourOwnComputer();
	}

	private NCDStoreBuildYourOwnComputer selectOSRadioBtnForVistaHome() {
		osRadioBtnForVistaHome.click();
		return new NCDStoreBuildYourOwnComputer();
	}

	private NCDStoreBuildYourOwnComputer selectsoftwareForMIcrosoftOffice() {
		softwareSelectionForMIcrosoftOffice.click();
		return new NCDStoreBuildYourOwnComputer();
	}

	private NCDStoreBuildYourOwnComputer clickAddToCartBtn() {
		addToCartBtn.click();
		return new NCDStoreBuildYourOwnComputer();
	}

	public NCDStoreBuildYourOwnComputer addToCartBuildYourOwnComputer() {
		selectProcessor();
		selectRam();
		selectHDDRadioBtnFor320GB();
		selectOSRadioBtnForVistaHome();
		selectsoftwareForMIcrosoftOffice();
		return clickAddToCartBtn();
	}

	public String getSuccessMessageForAddToCart() {
		return addTOCartSuccessMessage.getText();
	}

	public void closeAddToCartSuccessMessage() {
		addToCartSuccessMessageCloseBtn.click();
	}

	public NCDStoreShoppingCart clickShoppingCartBtn() {
		shoppingCartBtn.click();
		return new NCDStoreShoppingCart();
	}
}
