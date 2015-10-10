package cpmenulist;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import baseelements.BaseElements;
import clicklinks.Clicklinks;

public class Cpmenulist extends BaseElements {

	public Cpmenulist(WebDriver _mydriver)//constructor of Cpmenulist class
	{
		super(_mydriver);
	}
	
	public WebElement Topupmyki(){
		
		return  Clicklinks.waitToEnablebylink(mydriver,10,"Top up myki");
	}
	
	
	public WebElement Getmyki(){
		
		return Clicklinks.waitToEnablebylink(mydriver,10,"Get myki");
	}
	
	
	public WebElement Setupmyki(){
		
		return Clicklinks.waitToEnablebylink(mydriver,10,"Set up myki");
	}
	
	
	public WebElement Mymykiaccount(){
		
		return  Clicklinks.waitToEnablebylink(mydriver,10,"My myki account");
	}
	
	public WebElement Cardaccountrequests(){
	
		return  Clicklinks.waitToEnablebylink(mydriver,10,"Card/Account Requests");
		
	}
	
	public WebElement Contactus(){
		
		return  Clicklinks.waitToEnablebylink(mydriver,10,"Contact us");
		
	}
}
