package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInfoPage {
	//initialization
	public PaymentInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
		@FindBy(xpath= "//a[.='Add Payment']") private WebElement addpaymentBtn;
		
		
		
		@FindBy(xpath="//td[.='1660132810_183176431']/..//td[.='1660045392']") private WebElement paymentBtn;
		
		@FindBy(xpath="//td[.='1660132810_183176431']/..//a[.='Edit']") private WebElement editBtn;
		
		//utilization
		public void addpayment()
		{
			addpaymentBtn.click();
		}
		
		
		
		public void verifiedpayment(WebDriver driver,String clientid)
		{
			String code=driver.getPageSource();
		  if(code.contains(clientid))
		  {
			System.out.println("payment is created");  
		  }
		  else
		  {
			  System.out.println("payment is not created");
		  }
		}
		
		public void edit()
		{
			editBtn.click();
		}

}
