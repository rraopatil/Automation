package smoketests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import login.Login;
import cpmenulist.Cpmenulist;
import cpsubmenu.Cpsubmenulist;
import logout.Logout;

public class Testmykimenu {

public WebDriver mydriver;
	
	@Before
	public void beforeTest()// here in this case, prerequisite is open the browser along with url
	{
		mydriver = new FirefoxDriver();//my driver is object of class FirefoxDriver
		mydriver.get("https://www.mymyki.com.au/NTSWebPortal/Login.aspx");
		Login login = new Login(mydriver);
		login.UserName().sendKeys("zambo");
		login.Password().sendKeys("walker");
		login.LoginButton().click();
	}
	
	@After
	public void afterTest()
	{
		Logout logout = new Logout(mydriver);//using constructor, we are initializing the object 
		logout.LogoutButton().click();
	
		
	}
	
	@Test
	public void testmykimenu()
	{
		Cpmenulist cpmenulist = new Cpmenulist(mydriver);
		cpmenulist.Getmyki().click();
		cpmenulist.Setupmyki().click();
		cpmenulist.Topupmyki().click();
		cpmenulist.Mymykiaccount().click();
		cpmenulist.Contactus().click();
		cpmenulist.Cardaccountrequests().click();
		
		
		}
	
	
	
	
}
