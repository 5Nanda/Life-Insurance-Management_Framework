package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPaymentsPage {
	@FindBy(xpath="//h1[.='Add Payment']")
	private WebElement Addpay;

	@FindBy(xpath="//input[@name='recipt_no']")
	private WebElement reciptNoEdt;
	@FindBy(xpath="//input[@name='client_id']")
	private WebElement clientIdEdt;
	@FindBy(xpath="//input[@name='month']")
	private WebElement monthEdt;
	@FindBy(xpath="//input[@name='amount']")
	private WebElement amountEdt;
	@FindBy(xpath="//input[@name='due']")
	private WebElement dueEdt;
	@FindBy(xpath="//input[@name='fine']")
	private WebElement fineEdt;
	@FindBy(xpath="//input[@name='agent_id']")
	private WebElement agentIdEdt;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitBtn;

	public AddPaymentsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public void enterReciptNo(double reciptNo) {
		reciptNoEdt.sendKeys(String.valueOf(reciptNo));
	}
	public void enterClientId(String clientId) {
		clientIdEdt.sendKeys(clientId);
	}
	public void enterMonthOfPayment(String month) {
		monthEdt.sendKeys(month);
	}
	public void enterAmountOfPayment(Double Amount) {
		amountEdt.sendKeys(String.valueOf(Amount));
	}
	public void enterPaymentDue(double due) {
		dueEdt.sendKeys(String.valueOf(due));
	}

	public void enterFineToBePayed(double fine) {
		fineEdt.sendKeys(String.valueOf(fine));
	}

	public void enterAgentId(int AgentId) {
		agentIdEdt.sendKeys(String.valueOf(AgentId));
	}
	public void verifyAddPaymentPageisDisplayed() {
		if(Addpay.isDisplayed()) {
			System.out.println("add payment page is displayed");
		}
		else
			System.out.println("add payment page is not displayed");
	}
	public void verifyRecieptNofeildIsDisplayed() {

		if(reciptNoEdt.isDisplayed()) {
			System.out.println("Payment form is displayed");
		}
		else
			System.out.println("payment form not displayed");
	}
	public void verifyClientIdFeildIsDisplayed() {

		if(clientIdEdt.isDisplayed()) {
			System.out.println("clientid text feild is displayed");
		}
		else
			System.out.println("clientid text feild not displayed");
	}
	public void verifyMonthFeildIsDisplayed() {
		if(monthEdt.isDisplayed()) {
			System.out.println("Month text feild is displayed");
		}
		else
			System.out.println("month  text is not displayed");
	}

	public void verifyAmountFeildIsDisplayed() {
		if(amountEdt.isDisplayed()) {
			System.out.println("Amount text feild is displayed");
		}
		else
			System.out.println("amount text feild is not displayed");
		
	}
	public void verifyDueFeildIsDisplayed() {
		if(dueEdt.isDisplayed()) {
			System.out.println("Due Text feild is displayed");
		}
		else
			System.out.println("due text feild is not displayed");
	}
	
	public void verifyFineFeildIsDisplayed() {
		if(fineEdt.isDisplayed()) {
			System.out.println("Fine text feild is displayed");
		}
		else 
			System.out.println("fine text feild is not displayed");
	}
	public void verifyAgentFeildIsDisplayed() {
		if(agentIdEdt.isDisplayed()) {
			System.out.println("agent text feild is displayed");
		}
		else
			System.out.println("agent text feild is not displayed");
	}



	public void submitPaymentDetails() {
		submitBtn.click();
	}

}
