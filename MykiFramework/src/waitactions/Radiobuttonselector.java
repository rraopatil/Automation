package waitactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radiobuttonselector {

	public static WebElement waitToEnableinRadiobutton(WebDriver mydriver,int timeinseconds,String idstring)
	{
		WebDriverWait wait = new WebDriverWait(mydriver, timeinseconds);
		 WebElement radioBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idstring)));
		 return radioBtn;
		
	}
	
	
}
