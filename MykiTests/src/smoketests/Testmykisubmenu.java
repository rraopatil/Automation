package smoketests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import login.Login;
import cpsubmenu.Cpsubmenulist;

public class Testmykisubmenu {

	
public WebDriver mydriver;
	
	@Before
	public void beforeTest() throws InterruptedException// here in this case, prerequisite is open the browser along with url
	{
		mydriver = new FirefoxDriver();//my driver is object of class FirefoxDriver
		mydriver.get("https://www.mymyki.com.au/NTSWebPortal/Login.aspx");
		Login login = new Login(mydriver);
		mydriver.manage().window().maximize();
		login.UserName().sendKeys("zambo");
		login.Password().sendKeys("walker");
		login.LoginButton().click();
		login.AvailableCards();
		Thread.sleep(4000);
		
		
		
	}
	
	@After
	public void afterTest()
	{
		//Logout logout = new Logout(mydriver);//using constructor, we are initializing the object 
		//logout.LogoutButton().click();
	}
	
	@Test
	public void testmykisubmenu()
	{
		Cpsubmenulist cpsubmenu = new Cpsubmenulist(mydriver);
	
		cpsubmenu.Oneofftopup().click();
						
		//cpsubmenu.Setupautotopup().click();
		//cpsubmenu.ModifyAutoTopUp().click();
		//cpsubmenu.ChangePIN().click();
		//cpsubmenu.ChangePassword().click();
		//cpsubmenu.MyDetails().click();
		//cpsubmenu.MyRequests().click();
		//cpsubmenu.MyTransactions().click();
		//cpsubmenu.ManageMyCard().click();
		//cpsubmenu.Registermyki().click();
		//cpsubmenu.ReportLostStolen().click();
		//cpsubmenu.ApplyrefundOrReimbursement().click();
		//cpsubmenu.Replacemyki().click();
		
		}
	
	
		
}
