package operations;



import java.io.FileInputStream;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import waitactions.Radiobuttonselector;
import waitactions.Topupdetails;
import waitactions.WaitActions;
import baseelements.BaseElements;



public class Operations extends BaseElements {

	
	public Operations(WebDriver _mydriver)//constructor of Cpsubmenu class
	{
		super(_mydriver);
	}

public WebElement Topupmykimoney(){
	
	 return	Radiobuttonselector.waitToEnableinRadiobutton(mydriver, 10, "ctl00_uxContentPlaceHolder_uxTopUpMoney");

}


public WebElement Anonymoustopupmykimoney(){
	
	 return	WaitActions.waitToEnablebyID(mydriver, 10, "ctl00_uxContentPlaceHolder_uxCardNumberAnonynmous");

}


public WebElement Topupmykipass()
{
	
	return	Radiobuttonselector.waitToEnableinRadiobutton(mydriver, 10, "ctl00_uxContentPlaceHolder_topuppass");
}
	
public  Select Chooseamount()
{

	
//return Topupdetails.waitToEnablebyID(mydriver, 10, "ctl00_uxContentPlaceHolder_uxAmounts",GetTopupamount);

	WebElement topupAmount = WaitActions.waitToEnablebyID(mydriver, 10, "ctl00_uxContentPlaceHolder_uxAmounts");
	Select topupAmountSelect = new Select(topupAmount);
	return topupAmountSelect;

}

public WebElement Creditcard1()
{
	return WaitActions.waitToEnablebyID(mydriver, 10, "ctl00_uxContentPlaceHolder_uxCreditCardNumber1");
}

public WebElement Creditcard2()
{
	return WaitActions.waitToEnablebyID(mydriver, 10, "ctl00_uxContentPlaceHolder_uxCreditCardNumber2");
}

public WebElement Creditcard3()
{
	return WaitActions.waitToEnablebyID(mydriver, 10, "ctl00_uxContentPlaceHolder_uxCreditCardNumber3");
}

public WebElement Creditcard4()
{
	return WaitActions.waitToEnablebyID(mydriver, 10, "ctl00_uxContentPlaceHolder_uxCreditCardNumber4");
}


public Select Creditcardmonth()
{
	//return Topupdetails.waitToEnablebylist(mydriver, 10, "ctl00_uxContentPlaceHolder_uxMonthList");
	
	WebElement _month = WaitActions.waitToEnablebyID(mydriver, 10, "ctl00_uxContentPlaceHolder_uxMonthList");
	Select monthSelect = new Select(_month);
	return monthSelect;
}


public Select Creditcardyear()
{
	//return Topupdetails.waitToEnablebylist1(mydriver, 10, "ctl00_uxContentPlaceHolder_uxYearList");
	WebElement _year = WaitActions.waitToEnablebyID(mydriver, 10, "ctl00_uxContentPlaceHolder_uxYearList");
	Select yearSelect = new Select(_year);
	return yearSelect;
}


public WebElement CreditcardCVV()
{
	return WaitActions.waitToEnablebyID(mydriver, 10, "ctl00_uxContentPlaceHolder_uxSecurityCode");
}


public WebElement weborderref(){
	
	return WaitActions.waitToEnableinXpath(mydriver, 10, ".//*[@id='content']/fieldset/p[2]/strong");
}


}
