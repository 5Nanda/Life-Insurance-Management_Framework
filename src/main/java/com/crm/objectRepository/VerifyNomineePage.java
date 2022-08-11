package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyNomineePage {

	//initialization
		public VerifyNomineePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	//declaration	
	@FindBy(xpath = "//td[.='1511987599-513216278']/..//a[.='Client Status']")private WebElement verifynominee;
	
	//utilization
	public void Verifynominee() 
	{
		verifynominee.click();
		System.out.println("clicked on nominee");
	}	
}
