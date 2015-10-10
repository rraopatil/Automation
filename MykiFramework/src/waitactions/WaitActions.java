package waitactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitActions {

	public static WebElement waitToEnableinXpath(WebDriver mydriver,int timeinseconds,String xpathstring)
	{
		WebDriverWait wait = new WebDriverWait(mydriver, timeinseconds);
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathstring)));
	    return element;
	}
	
	public static WebElement waitToEnablebyID(WebDriver mydriver,int timeinseconds,String idstring)
	{
		WebDriverWait wait = new WebDriverWait(mydriver, timeinseconds);
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idstring)));
	    return element;
	}
	
	
}
