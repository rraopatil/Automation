package cploginprod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Cplogoutprod {

	protected static WebDriver driver;
	
	//WebDriver  driver = new FirefoxDriver();
		
	public static void findmyelement(){
				
		
		//driver.findElement(By.id("ctl00_uxHeader_uxLoginImg")).click();
		String myurl=driver.getCurrentUrl();
		System.out.println("url is " + myurl);
	if(driver.findElement(By.id("ctl00_uxHeader_uxLoginImg")).isEnabled())
	{

		driver.findElement(By.id("ctl00_uxHeader_uxLoginImg")).click();

	}
	 
   else {
   System.out.println("Element is not present");
   }
 	
	}


}