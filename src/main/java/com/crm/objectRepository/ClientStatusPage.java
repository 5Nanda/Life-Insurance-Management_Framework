package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientStatusPage {

	//Initialization
	public ClientStatusPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(xpath="//h1[@class='page-head-line']") private WebElement ClientStatus;
	
	//Utilization
	public WebElement getclientStatus() {
	return ClientStatus;
	}
	
}
