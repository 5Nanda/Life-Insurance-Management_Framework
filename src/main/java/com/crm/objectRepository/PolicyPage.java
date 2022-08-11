package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyPage {
	@FindBy(xpath="//div/h1")
	private WebElement PolicyInformation;
	
	@FindBy(xpath="//table")
	private WebElement Policytable;
	
	
 public PolicyPage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	 
 }
 
 public void verifyPolicyPageDisplayed() {
	 if(PolicyInformation.isDisplayed()) {
		 System.out.println("policy Page is displayed");
	 }
	 else
		 System.out.println("policy page is not displayed");
 }
 
 public void verifyPolicyTableIsDisplayed() {
	 if(Policytable.isDisplayed()) {
		 System.out.println("policy table is displayed");
	 }
	 else
		 System.out.println("policy table is not displayed");
 }
 
 public void verifyPolicyTableElementsIsDisplayed(String elements) {
	 if(Policytable.getText().contains(elements)) {
		 System.out.println(elements+" is displayed");
	 }
	 else
		 System.out.println(elements+"is not displayed");
 }
}
