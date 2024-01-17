package com.nopcommerce.demo.AutomationFrameworkForNopcommerce.tests;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopcommerce.demo.AutomationFramework.utils.Utils;
import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;
import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages.NCDRegister;
import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages.NCDStore;
import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages.NCDStoreBuildYourOwnComputer;
import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages.NCDStoreCheckoutBillingAddress;
import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages.NCDStoreCheckoutConfirmOrder;
import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages.NCDStoreCheckoutPaymentInfo;
import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages.NCDStoreCheckoutPaymentMethod;
import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages.NCDStoreCheckoutShippingMethod;
import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages.NCDStoreCheckoutSuccessful;
import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages.NCDStoreDesktops;
import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages.NCDStoreLogin;
import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages.NCDStoreShoppingCart;
import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages.Register;

public class NCDStoreCheckoutSuccessfulTest extends TestBase {
	NCDRegister ncdRegister;
	Register register;
	NCDStore ncdStore;
	NCDStoreLogin ncdStoreLogin;
	NCDStoreDesktops ncdStoreDesktops;
	NCDStoreBuildYourOwnComputer ncdStoreBuildYourOwnComputer;
	NCDStoreShoppingCart ncdStoreShoppingCart;
	NCDStoreCheckoutBillingAddress ncdStoreCheckoutBillingAddress;
	NCDStoreCheckoutShippingMethod ncdStoreCheckoutShippingMethod;
	NCDStoreCheckoutPaymentMethod ncdStoreCheckoutPaymentMethod;
	NCDStoreCheckoutPaymentInfo ncdStoreCheckoutPaymentInfo;
	NCDStoreCheckoutConfirmOrder ncdStoreCheckoutConfirmOrder;
	NCDStoreCheckoutSuccessful ncdStoreCheckoutSuccessful;
//to check for git fetch
	@BeforeMethod
	public void setUp() {
		initialisation();
		ncdStore = new NCDStore();
	}

	@Test
	public void validateOrderPlacedSuccessfully() {
		ncdRegister = ncdStore.clickRegisterHyperlink();
		register = ncdRegister.registerToPortal();
		Assert.assertEquals(register.getTextForSuccessfulRegister(), "Your registration completed",
				"Registration unsuccessful");
		register.clickContinueBtnAfterRegister();
		ncdStoreLogin = ncdStore.clickLoginHyperlink();
		System.out.println(ncdRegister.enterEmail);
		ncdStoreLogin.loginToPortal(ncdRegister.enterEmail);
		ncdStoreDesktops = ncdStore.mouseHoverComputerLink();
		ncdStoreBuildYourOwnComputer = ncdStoreDesktops.clickAddTOCartBuildYourOwnComputer();
		ncdStoreBuildYourOwnComputer.addToCartBuildYourOwnComputer();
//		System.out.println(ncdStoreBuildYourOwnComputer.getSuccessMessageForAddToCart());
//		Assert.assertEquals(ncdStoreBuildYourOwnComputer.getSuccessMessageForAddToCart(),
//				"The product has been added to your shopping cart");
//	    ncdStoreBuildYourOwnComputer.closeAddToCartSuccessMessage();
		ncdStoreShoppingCart = ncdStoreBuildYourOwnComputer.clickShoppingCartBtn();
		ncdStoreCheckoutBillingAddress = ncdStoreShoppingCart.checkOutForShoppingCart();
		ncdStoreCheckoutShippingMethod = ncdStoreCheckoutBillingAddress.checkoutForBillingAddress();
		ncdStoreCheckoutPaymentMethod = ncdStoreCheckoutShippingMethod.clickContinueBtnForShipping();
		ncdStoreCheckoutPaymentInfo = ncdStoreCheckoutPaymentMethod.clickContinueBtnForPaymentMethod();
		ncdStoreCheckoutConfirmOrder = ncdStoreCheckoutPaymentInfo.successfulPaymentInfoSubmission();
		ncdStoreCheckoutSuccessful = ncdStoreCheckoutConfirmOrder.clickConfirmBtn();
		System.out.println(ncdStoreCheckoutSuccessful.getTextForSuccessfulOrder());
		Assert.assertEquals(ncdStoreCheckoutSuccessful.getTextForSuccessfulOrder(),
				"Your order has been successfully processed!");
		}
	@Test
	public void verifyStoreSearchText() {
		ncdStore.getTextOfStoreSearch();
	}

	@AfterMethod
	public void quit() {
		tearDown();
	}

}
