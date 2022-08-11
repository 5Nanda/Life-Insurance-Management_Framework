package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgentInfo {
	
	//declaration
	@FindBy(xpath="//h1[@class='page-head-line']") private WebElement agentinfo;
	
	//initialization
	public AgentInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getagentinfo() {
		return agentinfo;
	}

}
