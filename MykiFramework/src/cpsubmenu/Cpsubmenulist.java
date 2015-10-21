package cpsubmenu;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import baseelements.BaseElements;
import clicklinks.Clicklinks;


public class Cpsubmenulist extends BaseElements {

	public Cpsubmenulist(WebDriver _mydriver)//constructor of Cpsubmenu class
	{
		super(_mydriver);
	}

		
public  WebElement Oneofftopup(){//topup after login into account
	
	
	WebElement element = mydriver.findElement(By.linkText("Top up myki"));
	Actions action = new Actions(mydriver);
    action.moveToElement(element).build().perform();
    return Clicklinks.waitToEnableinXpath(mydriver,30,"//li[@id='navOne-offtopup']/a");
	}
	

public  WebElement AnonymousTopup(){//top up without logging
	
	
	WebElement element = mydriver.findElement(By.linkText("Top up myki"));
	Actions action = new Actions(mydriver);
    action.moveToElement(element).build().perform();
    return Clicklinks.waitToEnableinXpath(mydriver,30,"//li[@id='navChoosetopup']/a");
	}
	
	public WebElement Setupautotopup(){
		
		WebElement element = mydriver.findElement(By.linkText("Top up myki"));
		Actions action = new Actions(mydriver);
	    action.moveToElement(element).build().perform();
		return Clicklinks.waitToEnableinXpath(mydriver,30, "//li[@id='navSetupautotopup']/a");
	}
	
	
	public WebElement ModifyAutoTopUp(){
		
		WebElement element = mydriver.findElement(By.linkText("Top up myki"));
		Actions action = new Actions(mydriver);
	    action.moveToElement(element).build().perform();
		return Clicklinks.waitToEnablebyID(mydriver,10,"navModifyautotopup");
	}
	
    public WebElement ManageMyCard(){
		
		return Clicklinks.waitToEnablebyID(mydriver,10,"navManagemycard");
	}

    public WebElement  MyTransactions(){
    	WebElement element = mydriver.findElement(By.linkText("My myki account"));
		Actions action = new Actions(mydriver);
	    action.moveToElement(element).build().perform();
    	return Clicklinks.waitToEnablebyID(mydriver,10,"navMytransactions");
    }

    
    public WebElement  MyDetails(){
    	WebElement element = mydriver.findElement(By.linkText("My myki account"));
		Actions action = new Actions(mydriver);
	    action.moveToElement(element).build().perform();
    	return Clicklinks.waitToEnablebyID(mydriver,60,"navMydetails");
    }
    
     public WebElement Registermyki(){
    	
    	return Clicklinks.waitToEnablebyID(mydriver,10,"navRegisteranothermyki");
    }

     public WebElement MyRequests(){
     	
    	return Clicklinks.waitToEnablebyID(mydriver,10,"navMyrequests");
    }

     public WebElement ChangePassword(){
    	 
    	 return Clicklinks.waitToEnablebyID(mydriver,10,"navChangepassword");
     }
     
     public WebElement ChangePIN(){
    	 
    	 return Clicklinks.waitToEnablebyID(mydriver,10,"navChangePIN");
     }
     
     public WebElement ApplyrefundOrReimbursement(){
    	 
    	 return Clicklinks.waitToEnablebyID(mydriver,10,"navApplyforarefundorreimbursement");
     }
     
     public WebElement ReportLostStolen(){
    	 
    	 return Clicklinks.waitToEnablebyID(mydriver,10,"navReportalostorstolenmyki");
     }
         public WebElement Replacemyki(){
    	 
    	 return Clicklinks.waitToEnablebyID(mydriver,10,"navReplacemyki");
     }
}

