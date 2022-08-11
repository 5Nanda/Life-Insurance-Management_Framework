package com.crm.framework.LifeInsuranceManagement.PaymentPage;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AddPaymentsPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.PaymentInfoPage;
import com.crm.objectRepository.PaymentsPage;
import com.crm.objectRepository.PaymentsPageOfClient;



public class PaymentTest extends BaseClass {
	@Test
	public void Payment() throws EncryptedDocumentException, FileNotFoundException, IOException{
		
		String clientid = eLib.readDataFromExcel("Payment", 1, 1);
		
		String month = eLib.readDataFromExcel("Payment", 1, 3);
		
		String amount = eLib.readDataFromExcel("Payment", 1, 8);
		
		String due = eLib.readDataFromExcel("Payment", 1, 4);
		
		String fine = eLib.readDataFromExcel("Payment", 1, 5);
		
		
		wLib.waitForPageToLoad(driver);
		
	
		HomePage homepage = new HomePage(driver);
		homepage.Paymentslink();
		
		PaymentInfoPage newpayment = new PaymentInfoPage(driver);
		newpayment.addpayment();
		
		 PaymentsPageOfClient paymentpage = new PaymentsPageOfClient(driver);
		paymentpage.ClientId(clientid);
		
		paymentpage.MonthTF(month);
		
		paymentpage.AmountTF(amount);
		
		paymentpage.DueTF(due);
		
		paymentpage.FineTF(fine);
		
		paymentpage.Submitbutton();
		
		homepage.Paymentslink();
		
		
		newpayment.verifiedpayment(driver, clientid);
		
	}

	
}
