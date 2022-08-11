package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NomineePage {

	//initialization
	public NomineePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(xpath = "//a[.='Add Nominee']")private WebElement addnomineebtn;
	
	@FindBy(xpath = "//a[.='Edit Client']")private WebElement editclientlnk;
	
	//utilization
	public void Addnomineebtn() 
	{
		addnomineebtn.click();
	}
	public void Editclientlnk() 
	{
		editclientlnk.click();
	}
}
