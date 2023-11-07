package com.nopcommerce.demo.AutomationFrameworkForNopcommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.demo.AutomationFrameworkForNopcommerce.base.TestBase;

public class NCDStore extends TestBase {

	public NCDStore() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "div.header-links ul li:first-of-type a")
	WebElement registerHyperlink;

	@FindBy(css = "ul.top-menu.notmobile li:first-of-type a")
	WebElement computersHyperlink;

	@FindBy(css = "a.ico-login")
	WebElement log_inHyperlink;
	
	@FindBy (css="input#small-searchterms")
	WebElement storeSearchBtn;

	public NCDRegister clickRegisterHyperlink() {
		registerHyperlink.click();
		return new NCDRegister();
	}

	public NCDStoreDesktops mouseHoverComputerLink() {
		Actions actions= new Actions (wd);
		actions.moveToElement(computersHyperlink).perform();;
		actions.moveToElement(wd.findElement(By.linkText("Desktops"))).perform();
		actions.click().perform();
		return new NCDStoreDesktops();
	}

	public NCDStoreLogin clickLoginHyperlink() {
		log_inHyperlink.click();
		return new NCDStoreLogin();
	}
	public void getTextOfStoreSearch() {
		String s=storeSearchBtn.getText();
		System.out.println(s);
	}

}
