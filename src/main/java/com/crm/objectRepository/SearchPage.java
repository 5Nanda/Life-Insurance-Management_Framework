package com.crm.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mysql.cj.jdbc.Driver;

public class SearchPage {

	//declaration
	@FindBy(xpath="//input[@type='text']") private WebElement TextField;
	
	@FindBy(xpath="//input[@class='searchBtn']") private WebElement Search;
	
	@FindBy(xpath="//td[text()='John Green']") private WebElement clientname;
	
	@FindBy(xpath="//td[text()='1511986256']") private WebElement clientid;
	
	@FindBy(xpath="//td[text()='1511986023-414821017']") private WebElement nomineeid;
	
	//initialization
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void textfield(String text) {
		TextField.sendKeys(text);
	}
	
	public void search() {
		Search.click();
	}
	
	public WebElement getclientname() {
		return clientname;
	}
	
	public WebElement getclientid() {
		return clientid;
	}
	
	public WebElement  getnomineeid() {
		return nomineeid;
		
	}
}