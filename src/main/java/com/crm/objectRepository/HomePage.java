package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(xpath = "//input[@type='text']")private WebElement searchtextfield;
	
	@FindBy(xpath = "//input[@type='submit']")private WebElement searchbutton;
	
	@FindBy(xpath = "//a[.='CLIENTS']")private WebElement clientslink;
	
	@FindBy(xpath = "//a[.='AGENTS']")private WebElement agentslink;
	
	@FindBy(xpath = "//a[.='POLICY']")private WebElement policylink;
	
	@FindBy(xpath = "//a[.='NOMINEE']")private WebElement nomineelink;
	
	@FindBy(xpath = "//a[.='PAYMENTS']")private WebElement paymentslink;
	
	@FindBy(xpath = "//a[@title='Logout']")private WebElement logoutbutton;

	public void Searchtextfield(String name) 
	{
	searchtextfield.sendKeys(name);
	}

	public void Searchbutton() 
	{
		searchbutton.click();
	}

	public void Clientslink() 
	{
		clientslink.click();
	}

	public void Agentslink() 
	{
		agentslink.click();
	}

	public void Policylink() 
	{
		policylink.click();
	}

	public void Nomineelink() 
	{
		nomineelink.click();
	}

	public void Paymentslink() 
	{
		paymentslink.click();
	}

	public void Logoutbutton() 
	{
		logoutbutton.click();
	}

}
