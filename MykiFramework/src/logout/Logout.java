package logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import waitactions.WaitActions;//import waitaction package details
import baseelements.BaseElements;

public class Logout extends BaseElements{

	public Logout(WebDriver _mydriver)//constructor of Logout class having one parameter
	{
		super(_mydriver);
	}


public WebElement LogoutButton()
{
	
return WaitActions.waitToEnablebyID(mydriver,10,"ctl00_uxHeader_uxLoginImg");

}


}
