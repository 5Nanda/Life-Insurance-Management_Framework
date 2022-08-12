package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentsPageOfClient {

	        //initialization
			public PaymentsPageOfClient(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//declaration
			@FindBy(xpath = "//input[@name='client_id']")private WebElement clientId;

			@FindBy(xpath = "//input[@name='name']")private WebElement nameTF;
			
			@FindBy(xpath = "//input[@name='month']")private WebElement monthTF;
			
			@FindBy(xpath = "//input[@name='amount']")private WebElement amountTF;
			
			@FindBy(xpath = "//input[@name='due']")private WebElement dueTF;
			
			@FindBy(xpath = "//input[@name='fine']")private WebElement fineTF;
			
			@FindBy(xpath = "//input[@name='agent_id']")private WebElement agentidTF;

			@FindBy(xpath = "//input[@type='submit']")private WebElement submitbutton;
			
			@FindBy(xpath = "//div[@class='col-md-12']")private WebElement verifyingpayment;
			
			//utilization
			public void ClientId(String id) 
			{
				clientId.sendKeys(id);
			}
			public void NameTF(String name) 
			{
				nameTF.sendKeys(name);
			}
			public void MonthTF(String month)
			{
				monthTF.sendKeys(month);
			}
			public void AmountTF(String amount) 
			{
				amountTF.sendKeys(amount);
			}
			public void DueTF(String due) 
			{
				dueTF.sendKeys(due);
			}
			public void FineTF(String fine) 
			{
				fineTF.sendKeys(fine);
			}
			public void AgentTF(String agentid) 
			{
				agentidTF.sendKeys(agentid);
			}
			public void Submitbutton()
			{
				submitbutton.click();
			}
			public void Verifyingpayment(String line)
			{
				String text = verifyingpayment.getText();
				text.contains(line);
				System.out.println("Payment is added");
			}
}
