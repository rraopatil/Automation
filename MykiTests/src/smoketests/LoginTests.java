package smoketests;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import login.Login;
import logout.Logout;


public class LoginTests {
	
	public WebDriver mydriver;
	
	@Before
	public void beforeTest()// here in this case, prerequisite is open the browser along with url
	{
		mydriver = new FirefoxDriver();//my driver is object of class FirefoxDriver
		mydriver.get("https://www.mymyki.com.au/NTSWebPortal/Login.aspx");
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
		FileInputStream fi=new FileInputStream("C:/Ram/Automation/RamAutomation/Automation_Testdata/Testdata.xlsx");
		//Workbook wb = Workbook.getWorkbook(fi);
		
		Workbook workbook = new XSSFWorkbook(fi);
		Sheet Sheet1 = workbook.getSheet("Sheet1");
		//Workbook obj=Workbook.getWorkbook(fi);
		//int i = 1;
		//Get sheet
		//Sheet s1=obj.getSheet(0);
		
	    int rowCount = Sheet1.getLastRowNum()-Sheet1.getFirstRowNum();
	    
	    System.out.println(rowCount);
	    for (int i = 0; i < rowCount+1; i++) {
	    	  Row row = Sheet1.getRow(i);

		for (int j = 0; j < row.getLastCellNum(); j++) {
		   
	//		login.UserName().sendKeys(Sheet1.getCell().getContents());
		//	login.Password().sendKeys("password");
		        }
		
		//login.LoginButton().click();

		}
	
	
	
		
	}
}

