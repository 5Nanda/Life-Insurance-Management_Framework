package com.crm.framework.LifeInsuranceManagement.PolicyPage;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.PolicyPage;

public class VerifYPolicyPageTest extends BaseClass {
	@Test
 public void verifyPolicyPage() {
		
	 String PolicyId = eLib.readDataFromExcel("policy", 1, 0);
	 String Term=eLib.readDataFromExcel("policy", 2, 0);
	 String TotalAmount=eLib.readDataFromExcel("policy", 3, 0);
	 String PerMonth=eLib.readDataFromExcel("policy", 4, 0);
	 String PaymentMethod=eLib.readDataFromExcel("policy", 5, 0);
	 String Coverage=eLib.readDataFromExcel("policy", 6, 0);
	 String AgeLimit=eLib.readDataFromExcel("policy", 7, 0);
	 
	 HomePage homepage=new HomePage(driver);
	 homepage.Policylink();
	 
	 PolicyPage policypage=new PolicyPage(driver);
	 policypage.verifyPolicyPageDisplayed();
	 policypage.verifyPolicyTableIsDisplayed();
	 policypage.verifyPolicyTableElementsIsDisplayed(PolicyId);
	 policypage.verifyPolicyTableElementsIsDisplayed(Term);
	 policypage.verifyPolicyTableElementsIsDisplayed(TotalAmount);
	 policypage.verifyPolicyTableElementsIsDisplayed(PerMonth);
	 policypage.verifyPolicyTableElementsIsDisplayed(PaymentMethod);
	 policypage.verifyPolicyTableElementsIsDisplayed(Coverage);
	 policypage.verifyPolicyTableElementsIsDisplayed(AgeLimit);
	 
	 
 }
}
