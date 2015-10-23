package smoketests;

import java.io.IOException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import login.Login;
import cpsubmenu.Cpsubmenulist;
import excelimport.DataFieldValues;
import excelimport.ReadData;
import operations.Operations;


public class OneofTopupmoney extends ReadData {
	protected String GetcardPAN;
	protected String GetTopupamount;
	protected String Getcreditcardnumber1;
	protected String Getcreditcardnumber2;
	protected String Getcreditcardnumber3;
	protected String Getcreditcardnumber4;
	protected String GetExpirymonth;
	protected String GetExpiryYear;
	protected String GetCVV;
	
	
	
public OneofTopupmoney() throws Exception {
		super();
		
	}

public WebDriver mydriver;
public List<DataFieldValues> datasheetList=readDataFromExcel("C:/JavaProjects/Automation/Automation_Testdata/Testdata.xlsx","Sheet1");
	
	@Before
	public void beforeTest() throws InterruptedException// here in this case, prerequisite is open the browser along with url
	{
		mydriver = new FirefoxDriver();//my driver is object of class FirefoxDriver
		mydriver.get("https://www.mymyki.com.au/NTSWebPortal/Login.aspx");
		Login login = new Login(mydriver);
		mydriver.manage().window().maximize();
		
}
	

	@After
	public void afterTest()
	{
	
	}
	
	@Test
	public void topup() throws IOException, InterruptedException
	{
		Login login = new Login(mydriver);
		if (datasheetList.size()==0){
			System.out.println("No Data found");
			 
	
		}
		else{
			
			for (DataFieldValues gData :datasheetList ){//enhanced for loop example for (int myvalue : myArray)
	
		Cpsubmenulist mysubmenu = new Cpsubmenulist(mydriver);
		mysubmenu.AnonymousTopup().click();
		
		GetcardPAN=gData.getCardPAN();
		GetTopupamount=gData.getTopupamount();
		Getcreditcardnumber1=gData.getCreditcardnumber1();
		Getcreditcardnumber2=gData.getCreditcardnumber2();
		Getcreditcardnumber3=gData.getCreditcardnumber3();
		Getcreditcardnumber4=gData.getCreditcardnumber4();
		GetExpirymonth=gData.getExpirymonth();
		GetExpiryYear=gData.getExpiryYear();
		GetCVV=gData.getCVV();
		Operations operations = new Operations(mydriver);
		operations.Anonymoustopupmykimoney().sendKeys(GetcardPAN);
		operations.Submitnext().click();
		operations.Topupmykimoney().click();
		operations.Submitrequest().click();
		operations.Chooseamount().selectByVisibleText(GetTopupamount);
		System.out.println(GetTopupamount);
 		operations.Submitrequest().submit();
		
		
		Thread.sleep(4000);
		//login.AvailableCards();
		Thread.sleep(4000);
		//Logout logout = new Logout(mydriver);//using constructor, we are initializing the object 
		//logout.LogoutButton().click();
	
}
}
	
}
}


