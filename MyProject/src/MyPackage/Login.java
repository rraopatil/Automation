package MyPackage;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Login {
	     public static void main(String[] args) throws Exception {
	               WebDriver driver = new FirefoxDriver();
	            driver.get("https://10.0.23.61/NTSCCPortal/cclogin.aspx");
	           //WebElement id = driver.findElement(By.id("loginID"));
	            //WebElement pass = driver.findElement(By.id("password"));
	           // WebElement button = driver.findElement(By.id("Button"));
	            
	           // id.sendKeys("Cheese");
	           // pass.sendKeys("password");
	           // button.click();
	            
	            
	     }
	            
	}