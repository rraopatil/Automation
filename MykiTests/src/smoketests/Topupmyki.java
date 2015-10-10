package smoketests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import login.Login;
import cpsubmenu.Cpsubmenulist;
import operations.Operations;



public class Topupmyki {


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
		Cpsubmenulist cpsubmenu = new Cpsubmenulist(mydriver);
		cpsubmenu.Oneofftopup().click();
		
	}
	
	@After
	public void afterTest()
	{
	
	}
	
	@Test
	public void topup() throws InterruptedException//topup myki money
	{
		Operations operations = new Operations(mydriver);
		operations.Topupmykimoney().click();
		//operations.Topupmykipass().click();
	    operations.Submitrequest().click();
	    operations.Chooseamount();
	    operations.Submitrequest().click();
	    Thread.sleep(4000);
	    operations.Creditcard1().sendKeys("4564");
	    operations.Creditcard2().sendKeys("0000");
	    operations.Creditcard3().sendKeys("0000");
	    operations.Creditcard4().sendKeys("0004");
	    Thread.sleep(4000);
	    operations.Creditcardmonth();
	    operations.Creditcardyear();
	    operations.CreditcardCVV().sendKeys("847");
	    Thread.sleep(4000);
	    operations.Submitrequest().click();
	    Thread.sleep(4000);
	    operations.Submitrequest().click();
	    }
	
	
	
	
}
