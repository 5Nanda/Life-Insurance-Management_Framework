package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNomineePage {

	   //initialization
		public AddNomineePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//declaration
		@FindBy(xpath = "//input[@name='client_id']")private WebElement clientId;

		@FindBy(xpath = "//input[@name='name']")private WebElement nomineenameTF;
		
		@FindBy(xpath = "//input[@name='sex']")private WebElement nomineegenderTF;
		
		@FindBy(xpath = "//input[@name='birth_datee_']")private WebElement nomineebirthdateTF;
		
		@FindBy(xpath = "//input[@name='nid']")private WebElement nomineenationalidTF;
		
		@FindBy(xpath = "//input[@name='relationship']")private WebElement nomineerelationshipTF;
		
		@FindBy(xpath = "//input[@name='priority']")private WebElement priorityTF;
		
		@FindBy(xpath = "//input[@name='phone']")private WebElement nomineephonenumberTF;

		@FindBy(xpath = "//input[@type='submit']")private WebElement submitbutton;
		
		@FindBy(xpath = "//div[@class='col-md-12']")private WebElement verifyingnominee;
		
		//utilization
		public void ClientId(String id) 
		{
			clientId.sendKeys(id);
		}
		public void NomineenameTF(String name) 
		{
			nomineenameTF.sendKeys(name);
		}
		public void NomineegenderTF(String gender)
		{
			nomineegenderTF.sendKeys(gender);
		}
		public void NomineebirthdateTF(String birthdate) 
		{
			nomineebirthdateTF.sendKeys(birthdate);
		}
		public void NomineenationalidTF(String nid) 
		{
			nomineenationalidTF.sendKeys(nid);
		}
		public void NomineerelationshipTF(String relationship) 
		{
			nomineerelationshipTF.sendKeys(relationship);
		}
		public void PriorityTF(String priority) 
		{
			priorityTF.sendKeys(priority);
		}
		public void NomineephonenumberTF(String phone) 
		{
			nomineephonenumberTF.sendKeys(phone);
		}
		public void Submitbutton()
		{
			submitbutton.click();
		}
		public void Verifyingnominee(String line)
		{
			String text = verifyingnominee.getText();
			text.contains(line);
			System.out.println("Nominee is added");
		}
}
