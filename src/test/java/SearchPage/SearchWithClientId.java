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
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.LoginPage;
import com.crm.objectRepository.SearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchWithClientId extends BaseClass {
	@Test
	public void SearchWithClintId() {

		//read the data from excel
		String clid = eLib.readDataFromExcel("search", 1, 2);
		
		//search the client name
		HomePage Hp=new HomePage(driver);
		Hp.Searchtextfield(clid);
		Hp.Searchbutton();
	//	SearchPage sp = new SearchPage(driver);
	//	sp.textfield(clid);
	//	sp.search();
		
	       //verify
		SearchPage sp=new SearchPage(driver);
	    String Name = sp.getclientid().getText();
	    Assert.assertTrue(Name.contains(clid));
		Reporter.log("clientid is created",true);
	    
	
	}

}

