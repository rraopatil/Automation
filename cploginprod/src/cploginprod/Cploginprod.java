package cploginprod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert; 
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Cploginprod {

	protected static WebDriver driver;
	
	
	  public static void main(String[] args)  {
          
	    	driver = new FirefoxDriver();
        
	    	driver.get("https://www.mymyki.com.au/NTSWebPortal/Login.aspx");
	         WebElement element_username = driver.findElement(By.id("ctl00_uxContentPlaceHolder_lblusername"));
	         element_username.sendKeys("zambo");
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	         WebElement element_password=driver.findElement(By.id("ctl00_uxContentPlaceHolder_uxPassword"));
	         element_password.sendKeys("walker");
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	         driver.findElement(By.id("ctl00_uxContentPlaceHolder_uxLogin")).click();
	         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	         driver. get("https://www.mymyki.com.au/NTSWebPortal/Registered/MyMykiAccount.aspx?menu=My%20myki%20account");
	         WebElement element3 = driver.findElement(By.xpath("//span[text()='Account Holder']"));
	         String strng = element3.getText();
	         Assert.assertEquals("Account Holder", strng);
	         WebElement element_UName = driver.findElement(By.id("ctl00_uxContentPlaceHolder_uxUserName"));
	         System.out.println(strng + ":" + element_UName.getText());
	         WebElement lastlogin=driver.findElement(By.id("ctl00_uxHeader_uxLoginInfo"));
	         String logintxt=lastlogin.getText();
	         System.out.println("Please check:"+logintxt);
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         
	         
	        String crturl=driver.getCurrentUrl();//to get current url of the page under use
	     	System.out.println("you are  in webpage:"+crturl);
	     	
	     	Cploginprod a =new Cploginprod();
	     	a.Countcards();
	     	a.topupmyki();
	     	//driver.findElement(By.id("ctl00_uxHeader_uxLoginImg")).click();
	        //findmyelement();
	         
	         //WebElement element4 = driver.findElement(By.xpath("//span[text()='LoginInfo']"));
	        // String strng1=element4.getText();
	         //System.out.println("last login is :" + strng1);
	         
	       	          
}
	  public  void Countcards(){
		  
		 
		  WebElement htmltable=driver.findElement(By.xpath("//*[@id='ctl00_uxContentPlaceHolder_uxMyCards']/tbody"));
		  		  
		  List<WebElement> rows=htmltable.findElements(By.tagName("tr"));
		  //System.out.println("Total number of cards in use are  :"+ rows.size());//check how to get output as 5 records
		  
		  for(int rnum=0;rnum<rows.size();rnum++)
		  
		  {
		  
		  List<WebElement> columns=rows.get(rnum).findElements(By.tagName("td"));
		  
		  //System.out.println("Number of columns :"+columns.size());
		  
		   		 
		  for(int cnum=0;cnum<columns.size();cnum++)
		  
		  {
		  
		  System.out.println(""+columns.get(cnum).getText()+"");
		  
		  }
		  
		  
		  
		  }
	

	  
		}

   
	  public void topupmyki(){
		  
		WebElement topupmyki=driver.findElement(By.linkText("Top up myki")); 
	    topupmyki.click();	
	  }
	  
	   
   }


