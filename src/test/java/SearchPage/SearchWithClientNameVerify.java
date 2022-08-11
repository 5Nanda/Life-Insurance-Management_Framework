package SearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.genericUtilities.ExcelUtility;
import com.crm.genericUtilities.FileUtility;
import com.crm.genericUtilities.JavaUtility;
import com.crm.genericUtilities.WebDriverUtility;
import com.crm.objectRepository.LoginPage;
import com.crm.objectRepository.SearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchWithClientNameVerify extends BaseClass {
      @Test
	public void SearchWithClientName() {
	 
	 //read the data from excel
	String name = eLib.readDataFromExcel("search", 1, 0);
	  
		
		//search the client name
		SearchPage sp = new SearchPage(driver);
		sp.textfield(name);
		sp.search();
		
		//verification
	String NAME = sp.getclientname().getText();
	Assert.assertTrue(NAME.contains(name));
	Reporter.log("client name is created",true);
	
	}

}
