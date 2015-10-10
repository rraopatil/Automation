package login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.google.common.base.Function;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {

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

