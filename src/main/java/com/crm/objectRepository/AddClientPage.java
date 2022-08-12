package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClientPage {

	//initialization
	public AddClientPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(xpath="//input[@name='client_id']") private WebElement ClientIdEdt;
	
	@FindBy(xpath = "//input[@name='client_password']")private WebElement clientpasswordTF;
	
	@FindBy(xpath = "//input[@name='name']")private WebElement clientnameTF;
	
	@FindBy(xpath = "//input[@name='fileToUpload']")private WebElement imguplaod;
	
	@FindBy(xpath = "//input[@name='sex']")private WebElement clientgenderTF;
	
	@FindBy(xpath = "//input[@name='birth_date']")private WebElement clientbirthdateTF;
	
	@FindBy(xpath = "//input[@name='nid']")private WebElement clientnationalidTF;
	
	@FindBy(xpath = "//input[@name='phone']")private WebElement clientphoneTF;
	
	@FindBy(xpath = "//input[@name='address']")private WebElement clientaddressTF;
	
	@FindBy(xpath = "//input[@name='policy_id']")private WebElement policyidTF;
	
	@FindBy(xpath = "//input[@name='agent_id']")private WebElement agentidTF;
	
	@FindBy(xpath = "//input[@name='maritial_status']")private WebElement clientmatrialstatusTF;
	
	@FindBy(xpath = "//input[@name='nominee_name']")private WebElement nomineenameTF;
	
	@FindBy(xpath = "//input[@name='nominee_sex']")private WebElement nomineegenderTF;
	
	@FindBy(xpath = "//input[@name='nominee_birth_date']")private WebElement nomineebirthdateTF;
	
	@FindBy(xpath = "//input[@name='nominee_nid']")private WebElement nomineenationalidTF;
	
	@FindBy(xpath = "//input[@name='nominee_relationship']")private WebElement nomineerelationshipTF;
	
	@FindBy(xpath = "//input[@name='priority']")private WebElement priorityTF;
	
	@FindBy(xpath = "//input[@name='nominee_phone']")private WebElement nomineephonenumberTF;

	@FindBy(xpath = "//input[@type='submit']")private WebElement submitbutton;

	//utilization
	public void ClientpasswordTF(String password) 
	{
		 clientpasswordTF.sendKeys(password);
	}
	public void ClientnameTF(String name) 
	{
		 clientnameTF.sendKeys(name);
	}
	public void Imguplaod(String path) 
	{
		imguplaod.sendKeys(path);
	}
	public void ClientgenderTF(String gender) 
	{
		clientgenderTF.sendKeys(gender);
	}
	public void ClientbirthdateTF(String birthdate)
	{
		clientbirthdateTF.sendKeys(birthdate);
	}
	public void ClientnationalidTF(String nationalID) 
	{
	    clientnationalidTF.sendKeys(nationalID);
	}
	public void ClientphoneTF(String phone) 
	{
		clientphoneTF.sendKeys(phone);
	}
	public void ClientaddressTF(String address) 
	{
		clientaddressTF.sendKeys(address);;
	}
	public void PolicyidTF(String policyID) 
	{
		policyidTF.sendKeys(policyID);
	}
	public void AgentidTF(String agentID)
	{
		agentidTF.sendKeys(agentID);
	}
	public void ClientmatrialstatusTF(String matrialstatus) 
	{
		 clientmatrialstatusTF.sendKeys(matrialstatus);
	}
	public void NomineenameTF(String nomineename) 
	{
		nomineenameTF.sendKeys(nomineename);
	}
	public void NomineegenderTF(String nomineegender) 
	{
		nomineegenderTF.sendKeys(nomineegender);
	}
	public void NomineebirthdateTF(String nomineeBirth) 
	{
		nomineebirthdateTF.sendKeys(nomineeBirth);
	}
	public void NomineenationalidTF(String nomineenationalID) 
	{
		nomineenationalidTF.sendKeys(nomineenationalID);
	}
	public void NomineerelationshipTF(String nomineerelationship) 
	{
		nomineerelationshipTF.sendKeys(nomineerelationship);
	}
	public void PriorityTF(String priority) 
	{
		priorityTF.sendKeys(priority);
	}
	public void NomineephonenumberTF(String nomineephonenumber) throws InterruptedException 
	{
		nomineephonenumberTF.sendKeys(nomineephonenumber);
		Thread.sleep(2000);
	}
	
	public String getClientId() {
		String clientId = ClientIdEdt.getAttribute("value");
		return clientId;
	}
	
	public void Submitbutton() throws InterruptedException 
	{
		submitbutton.click();
		Thread.sleep(2000);
		
	}
}