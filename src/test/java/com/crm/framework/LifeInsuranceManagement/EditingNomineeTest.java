package com.crm.framework.LifeInsuranceManagement;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.NomineePage;

public class EditingNomineeTest extends BaseClass {

	@Test
	
	public void EditingNomineeTest() {
		
	HomePage homepage = new HomePage(driver);
	homepage.Nomineelink();
	
	NomineePage nomineepage = new NomineePage(driver);
	nomineepage.Addnomineebtn();
	nomineepage.Editclientlnk();
	
	
	}
}
