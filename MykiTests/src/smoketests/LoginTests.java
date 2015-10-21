package smoketests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.IOException;
import java.util.List;
import login.Login;
import logout.Logout;
import excelimport.DataFieldValues;
import excelimport.ReadData;




public class LoginTests extends ReadData {
	protected String GetUserName;
	protected String GetPassword;
	
	
	public LoginTests() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver mydriver;
	public List<DataFieldValues> datasheetList=readDataFromExcel("C:/JavaProjects/Automation/Automation_Testdata/Testdata.xlsx","Sheet1");
	@Before
	public void beforeTest()// here in this case, prerequisite is open the browser along with url
	{
		mydriver = new FirefoxDriver();//my driver is object of class FirefoxDriver
		mydriver.get("https://www.mymyki.com.au/NTSWebPortal/Login.aspx");
		mydriver.manage().window().maximize();
	}
	
	@After
	public void afterTest()
	{
		//Logout logout = new Logout(mydriver);//using constructor, we are initializing the object 
		//logout.LogoutButton().click();
	}
	
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		Login login = new Login(mydriver);
		if (datasheetList.size()==0){
			System.out.println("No Data found");
			 
	
		}
		else{
			
			for (DataFieldValues gData :datasheetList ){//enhanced for loop example for (int myvalue : myArray)
				GetUserName=gData.getUserName();
				GetPassword=gData.getPassword();
				login.UserName().sendKeys(GetUserName);
				login.Password().sendKeys(GetPassword);
				login.LoginButton().click();
				Thread.sleep(4000);
				login.AvailableCards();
				Thread.sleep(4000);
				Logout logout = new Logout(mydriver);//using constructor, we are initializing the object 
				logout.LogoutButton().click();
				
				
				
			}
			mydriver.close();
		}
		


	}
		
		
		}

	


