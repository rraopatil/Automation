package sample;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlesearch {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  WebDriver mydrive = new FirefoxDriver();
  mydrive.get("https://www.google.com.au/?gfe_rd=cr&ei=H6syVsnsCKju8wfB_4qwCw&gws_rd=ssl");
  WebElement searchelement = mydrive.findElement(By.id("lst-ib"));
  searchelement.sendKeys("apple");
  mydrive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 WebElement searchelementbutton =mydrive.findElement(By.xpath(".//*[@id='sblsbb']/button"));
 //mydrive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 //Thread.sleep(5000);
 searchelementbutton.submit();
 }

}