package com.crm.framework.LifeInsuranceManagement;

	import org.testng.annotations.Test;

	import com.crm.genericUtilities.BaseClass;
	import com.crm.objectRepository.AddClientPage;
	import com.crm.objectRepository.ClientStatusPage;
import com.crm.objectRepository.ClientsPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.LoginPage;

	public class ClientInformationTest extends BaseClass{
			/*public static void main(String[]args) throws InterruptedException {

			WebDriver driver= null;

			ExcelUtility eLib=new ExcelUtility();
			FileUtility flib=new FileUtility();*/
			
		    @Test
			public void LoggingtoInsurancepageTest1() throws InterruptedException{
			{
				String BROWSER = fLib.getPropertKeyValue("browser");
				String Url = fLib.getPropertKeyValue("url");
				String UN = fLib.getPropertKeyValue("username");
				String PW = fLib.getPropertKeyValue("password");
				
				//read the data from excel file
				String Clientpw = eLib.readDataFromExcel("Client", 1, 0);
				String Cname=eLib.readDataFromExcel("Client", 1, 1);
				String CImage=eLib.readDataFromExcel("Client", 1, 2);
				String Cgender=eLib.readDataFromExcel("Client", 1, 3);
				String CBirth=eLib.readDataFromExcel("Client", 1, 4);
				String CMarital=eLib.readDataFromExcel("Client", 1, 5);
				String Cnid=eLib.readDataFromExcel("Client", 1, 6);
				String CPhone=eLib.readDataFromExcel("Client", 1, 7);
				String Caddress=eLib.readDataFromExcel("Client", 1, 8);
				String CPolicyID=eLib.readDataFromExcel("Client", 1, 9);
				String ClientStatus=eLib.readDataFromExcel("Client", 1, 10);
				
				String Nname=eLib.readDataFromExcel("Nominee", 1, 0);
				String NGender=eLib.readDataFromExcel("Nominee", 1, 1);
				String NBirth=eLib.readDataFromExcel("Nominee", 1, 2);
				String Nnid=eLib.readDataFromExcel("Nominee", 1, 3);
				String Nrelat=eLib.readDataFromExcel("Nominee", 1, 4);
				String Nprio=eLib.readDataFromExcel("Nominee", 1, 5);
				String Nphno=eLib.readDataFromExcel("Nominee", 1, 6);

				/*if(BROWSER.equalsIgnoreCase("chrome")) {

					WebDriverManager.chromedriver().setup();
					driver=new ChromeDriver();
				}
				else if(BROWSER.equalsIgnoreCase("firefox"))
				{
					WebDriverManager.firefoxdriver().setup();
					driver=new FirefoxDriver();
				}
				else
				{
					driver=new ChromeDriver();
				}

				driver.get(Url);

				InsuranceLoginPage loginpage=new InsuranceLoginPage(driver);
				loginpage.Login(UN, PW);*/

				HomePage Hp=new HomePage(driver);
				Hp.Clientslink();
			
				
				ClientsPage client=new ClientsPage(driver);
				client.addclickbutton();
				
				
				AddClientPage clientpage=new AddClientPage(driver);
				String clientId=clientpage.getClientId();
				clientpage.ClientpasswordTF(Clientpw);
				clientpage.ClientnameTF(Cname);
				clientpage.Imguplaod(CImage);
				clientpage.ClientgenderTF(Cgender);
				clientpage.ClientbirthdateTF(CBirth);
				clientpage.ClientmatrialstatusTF(CMarital);
				clientpage.ClientnationalidTF(Cnid);
				clientpage.ClientphoneTF(CPhone);
				clientpage.ClientaddressTF(Caddress);
				clientpage.PolicyidTF(CPolicyID);
				
				clientpage.NomineenameTF(Nname);
				clientpage.NomineegenderTF(NGender);
				clientpage.NomineebirthdateTF(NBirth);
				clientpage.NomineenationalidTF(Nnid);
				clientpage.NomineerelationshipTF(Nrelat);
				clientpage.PriorityTF(Nprio);
				clientpage.NomineephonenumberTF(Nphno);
				
				//clicked on submit button 
				clientpage.Submitbutton();
				
				//Client information is displayed
				Hp.Clientslink();
				
				//Click on logout link
				logoutFromAppln();
				
				LoginPage loginpage=new LoginPage(driver);
				loginpage.Login(clientId, Clientpw);
				
				ClientStatusPage csp=new ClientStatusPage(driver);
				String text=csp.getclientStatus().getText();
				
				if(text.contains(ClientStatus)) {
					System.out.println("Client id is created");
				}
				else
				{
					System.out.println("Client id is not created");
				}
				
		
			}
		}
	}


