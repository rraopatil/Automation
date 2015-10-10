package baseelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import waitactions.WaitActions;

public class BaseElements {
	
protected WebDriver mydriver;//declaration

public BaseElements(WebDriver _mydriver)//constructor of the class with one parameter
{
	mydriver = _mydriver;//assigning value to instance variable of the class
}


public WebElement AvailableCards()
{
	return WaitActions.waitToEnablebyID(mydriver, 60, "ctl00_uxContentPlaceHolder_uxMyCards");
	
}

public WebElement Submitrequest()
{
	return WaitActions.waitToEnablebyID(mydriver, 60, "ctl00_uxContentPlaceHolder_uxSubmit");
}


}

