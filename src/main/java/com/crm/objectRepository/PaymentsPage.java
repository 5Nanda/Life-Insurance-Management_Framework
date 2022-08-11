package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class PaymentsPage {

	@FindBy(xpath="//a[text()='Add Payment']")
	private WebElement addPaymentLink;
	@FindBy(xpath="//h1[contains(text(),'Payment Informations')]")
	private WebElement paymentInfo;
	
	
	
	
	public PaymentsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddPayment() {
		addPaymentLink.click();
	}
	public void clickOnEdit(WebDriver driver,String recieptNum) {
		String action="Edit";
		WebDriverUtility wLib=new WebDriverUtility();
		wLib.addLinkTextToXpath(driver,recieptNum,action).click();;
	}
	public void verifyPaymentPageIsDisplayed() {
		if(paymentInfo.isDisplayed()) {
			System.out.println("payment page is displayed");
		}
		else
			System.out.println("payment page is not displayed");
	}
	public void verifyAddPaymentLinkIsDisplayed() {
		if(addPaymentLink.isDisplayed()) {
			System.out.println("add payment link is not displayed");
		}
		else
			System.out.println("add payment link is not displayed");
	}
	

}
