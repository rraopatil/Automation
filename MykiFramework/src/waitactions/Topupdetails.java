package waitactions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Topupdetails {

		public static  List<WebElement>  waitToEnablebyID(WebDriver mydriver,int timeinseconds,String idstring,String GetTopupamount)
	{
			String value= GetTopupamount;
			
		WebDriverWait wait = new WebDriverWait(mydriver, timeinseconds);
		WebElement topupvalue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idstring)));	
		//WebElement topupvalue = mydriver.findElement(By.id("idstring")); 
		Select myvalue= new Select(topupvalue);
		//myvalue.selectByVisibleText("GetTopupamount");
		//System.out.println("GetTopupamount");
		
		List<WebElement> options = myvalue.getOptions();
		for (WebElement option : options) {
			
		 if (option.getText().equalsIgnoreCase(GetTopupamount)) {
		        option.click();
		     break;
		}
		}
		return options;
		

		
		
			
	}
	
		
		public static  List<WebElement> waitToEnablebylist(WebDriver mydriver,int timeinseconds,String idstring){
			
			WebDriverWait wait = new WebDriverWait(mydriver, timeinseconds);
			WebElement _month = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idstring)));	
					
			Select mymonth= new Select(_month);
			List<WebElement> options = mymonth.getOptions();
			for (WebElement option : options) {
				
				 if (option.getText().equalsIgnoreCase("Feb")) {
				        option.click();
				      break;
			}
			}
			return options ;//
			
			
				
		}
		
		
public static  List<WebElement> waitToEnablebylist1(WebDriver mydriver,int timeinseconds,String idstring){
			
			WebDriverWait wait = new WebDriverWait(mydriver, timeinseconds);
			WebElement _year = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idstring)));	
					
			Select myyear= new Select(_year);
			List<WebElement> options = myyear.getOptions();
			for (WebElement option : options) {
				
				 if (option.getText().equalsIgnoreCase("2019")) {
				        option.click();
				      break;
			}
			}
			return options ;//
			
			
				
		}
		}
		

