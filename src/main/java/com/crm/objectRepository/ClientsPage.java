package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientsPage {

	//initialization
	public ClientsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(xpath = "//a[.='Add Client']")private WebElement addclickbutton;
	
	//utilization
	public void addclickbutton()
	{
		addclickbutton.click();
	}
}
