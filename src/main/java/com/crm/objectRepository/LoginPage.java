package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
  
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(name = "username")private WebElement usernametextfield;
	
	@FindBy(name = "password")private WebElement passwordtextfield;
	
	@FindBy(xpath = "//button[.='login']")private WebElement loginbutton;
	
	public WebElement getUsernametextfield() 
	{
		return usernametextfield;
	}
	public WebElement getPasswordtextfield() 
	{
		return passwordtextfield;
	}
	public WebElement getLoginbutton()
	{
		return loginbutton;
	}
	
	//utilization
	public void Login(String username, String password)
	{
		getUsernametextfield().sendKeys(username);
		getPasswordtextfield().sendKeys(password);
		loginbutton.click();
	}
}
