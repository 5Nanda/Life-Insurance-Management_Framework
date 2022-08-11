package com.crm.framework.LifeInsuranceManagement;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AddClientPage;
import com.crm.objectRepository.ClientsPage;
import com.crm.objectRepository.HomePage;

public class CreateClientTest extends BaseClass{
  @Test
	public void CreateClientTest1() throws InterruptedException{
		
	//To Get Random Number
	//int ranNum = jLib.getRandomNumber();
	
	//fetch the data from excel
	String clpwd = eLib.readDataFromExcel("AddClient", 1,1);
	String clname = eLib.readDataFromExcel("AddClient", 1,2);
	String climg = eLib.readDataFromExcel("AddClient", 1,3);
	String clgender = eLib.readDataFromExcel("AddClient", 1,4);
	String clbirthdate = eLib.readDataFromExcel("AddClient", 1,5);
	String clmatrialstatus = eLib.readDataFromExcel("AddClient", 1,6);
	String clNationalId = eLib.readDataFromExcel("AddClient", 1,7);
	String clphone = eLib.readDataFromExcel("AddClient", 1,8);
	String claddress = eLib.readDataFromExcel("AddClient", 1,9);
	String policyId = eLib.readDataFromExcel("AddClient", 1,10);
	String agentId = eLib.readDataFromExcel("AddClient", 1,11);
	String nominnename = eLib.readDataFromExcel("AddClient", 1,12);
	String nomineegender = eLib.readDataFromExcel("AddClient", 1,13);
	String nomineebirthdate = eLib.readDataFromExcel("AddClient", 1,14);
	String nomineenationalid = eLib.readDataFromExcel("AddClient", 1,15);
	String nomineerelationship = eLib.readDataFromExcel("AddClient", 1,16);
	String priority = eLib.readDataFromExcel("AddClient", 1,17);
	String nomineePhomeNum = eLib.readDataFromExcel("AddClient", 1,18);
	
	HomePage homepage = new HomePage(driver);
	homepage.Clientslink();
	
	ClientsPage clientpage = new ClientsPage(driver);
	clientpage.addclickbutton(); 
	
	AddClientPage addclientpage = new AddClientPage(driver);
	addclientpage.ClientpasswordTF(clpwd);
	addclientpage.ClientnameTF(clname);
	addclientpage.Imguplaod(climg);
	addclientpage.ClientgenderTF(clgender);
	addclientpage.ClientbirthdateTF(clbirthdate);
	addclientpage.ClientaddressTF(claddress);
	addclientpage.ClientmatrialstatusTF(clmatrialstatus);
	addclientpage.ClientnationalidTF(clNationalId);
	addclientpage.ClientphoneTF(clphone);
	addclientpage.ClientaddressTF(claddress);
	addclientpage.PolicyidTF(policyId);
	addclientpage.AgentidTF(agentId);
	
	addclientpage.NomineenameTF(clname);
	addclientpage.NomineenameTF(nominnename);
	addclientpage.NomineegenderTF(nomineegender);
	addclientpage.NomineebirthdateTF(nomineebirthdate);
	addclientpage.NomineenationalidTF(nomineenationalid);
	addclientpage.NomineerelationshipTF(nomineerelationship);
	addclientpage.PriorityTF(priority);
	addclientpage.NomineephonenumberTF(nomineePhomeNum);
	addclientpage.Submitbutton();
	
	System.out.println("Client is added");
}
}
