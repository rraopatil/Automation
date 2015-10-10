package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class loginpage {

		    public static void main(String[] args)  {
	               
		    	WebDriver driver = new FirefoxDriver();
	          
		    	driver.get("http://gmail.com");
		    	 // Enter userd
		         WebElement element = driver.findElement(By.id("Email"));
		         element.sendKeys("xambo@gmail.com");
		       //wait 5 secs for  userid to be entered
		         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		         //clcik on next to get the text box with password
		         driver.findElement(By.id ("next")).click();
		         //wait for 2 seconds for the page to load
		         driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		         WebElement element1=driver.findElement(By.id("Passwd"));
		         element1.sendKeys("123459");
		         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		         driver.findElement(By.id("signIn")).click();
}	
}