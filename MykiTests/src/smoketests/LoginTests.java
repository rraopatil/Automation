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
import operations.ExcelDataConfig;
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
	protected List<DataFieldValues> datasheetlist=readDataFromExcel("C:/JavaProjects/Automation/Automation_Testdata.Testdata.xlsx","Sheet1");
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
		Logout logout = new Logout(mydriver);//using constructor, we are initializing the object 
		logout.LogoutButton().click();
	}
	
	@Test
	public void loginTest() throws IOException
	{
		Login login = new Login(mydriver);
		if (datasheetList.size()==0){
			System.out.println("No Data found");
			 
	
		}
		else{
			
			for (DataFieldValues gData :datasheetList ){
				GetUserName=gData.getUserName();
				GetPassword=gData.getPassword();
				login.UserName().sendKeys(GetUserName);
				login.Password().sendKeys(GetPassword);
				login.LoginButton().click();
			}
			
		}
		
		//ExcelDataConfig Excel=new ExcelDataConfig("C:/JavaProjects/Automation/Automation_Testdata/Testdata.xlsx");
		//Excel.username(0);
		
		
		   //login.LoginButton().click();
		  //System.out.println(username1);

		
		
		
		
		
		
		
		//login.UserName().sendKeys(Excel.username(0));
		//login.Password().sendKeys(Excel.password(0));
			   
	//		login.UserName().sendKeys(Sheet1.getCell().getContents());
		//	login.Password().sendKeys("password");
		    
		//login.LoginButton().click();

	}
		
		
		}

	


