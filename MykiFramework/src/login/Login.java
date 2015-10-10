package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import waitactions.WaitActions;//import waitaction package details
import baseelements.BaseElements;

public class Login extends BaseElements{
	
	
	
	public Login(WebDriver _mydriver)//constructor of login class
	{
		super(_mydriver);
	}

	public WebElement UserName()
	{
		
	 return	WaitActions.waitToEnablebyID(mydriver, 10, "ctl00_uxContentPlaceHolder_lblusername");
	
	}
	
	
	public WebElement Password()
	{
		return WaitActions.waitToEnablebyID(mydriver,10,"ctl00_uxContentPlaceHolder_uxPassword");
	}
	
	public WebElement LoginButton()
	{
		return WaitActions.waitToEnablebyID(mydriver, 10, "ctl00_uxContentPlaceHolder_uxLogin");
	}

}
