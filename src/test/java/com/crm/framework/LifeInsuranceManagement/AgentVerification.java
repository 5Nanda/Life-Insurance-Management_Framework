package com.crm.framework.LifeInsuranceManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.genericUtilities.ExcelUtility;
import com.crm.genericUtilities.FileUtility;
import com.crm.genericUtilities.JavaUtility;
import com.crm.genericUtilities.WebDriverUtility;
import com.crm.objectRepository.AgentInfo;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AgentVerification extends BaseClass{
   @Test
	public void AgntVerification() {
	
	 
	 //read the data from excel
	String agn = eLib.readDataFromExcel("search", 1,4);
	  
		
		
		//click on agent module
		HomePage hp = new HomePage(driver);
		hp.Agentslink();
		
		//verification
		AgentInfo agent = new AgentInfo(driver);
		String text = agent.getagentinfo().getText();
		if(text.contains(agn)) {
			System.out.println("agent  module is verified");
			
		}
		else {
			System.out.println("agent module is not verified");
		}
	}

}
