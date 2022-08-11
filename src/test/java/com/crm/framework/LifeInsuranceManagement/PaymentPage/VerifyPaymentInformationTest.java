package com.crm.framework.LifeInsuranceManagement.PaymentPage;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AddPaymentsPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.PaymentsPage;

public class VerifyPaymentInformationTest extends BaseClass{
	@Test
	public void verifyPaymentInformation() {
		HomePage homepage=new HomePage(driver);
		homepage.Paymentslink();
		PaymentsPage payment=new PaymentsPage(driver);
		payment.verifyPaymentPageIsDisplayed();
		payment.clickOnAddPayment();
		AddPaymentsPage addpayment=new AddPaymentsPage(driver);
		addpayment.verifyAddPaymentPageisDisplayed();
		addpayment.verifyRecieptNofeildIsDisplayed();
		addpayment.verifyMonthFeildIsDisplayed();
		addpayment.verifyFineFeildIsDisplayed();
		addpayment.verifyDueFeildIsDisplayed();
		addpayment.verifyClientIdFeildIsDisplayed();
		addpayment.verifyAmountFeildIsDisplayed();
		addpayment.verifyAgentFeildIsDisplayed();
		
		
		
		
		
	}

}
