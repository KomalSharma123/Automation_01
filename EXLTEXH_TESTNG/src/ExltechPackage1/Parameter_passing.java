package ExltechPackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_passing {
	WebDriver driver;
	
  @Test
  @Parameters({"Author","Search"})
  public void Parameter(@Optional("ABC")String Author,CharSequence[] Search) throws InterruptedException 
  {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver(); 
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://google.com/");
	  WebElement element=driver.findElement(By.name("q"));
	  element.sendKeys(Search);
	  Thread.sleep(2000);
	  System.out.println("Welcome" +Author+ "User" +Search);
  }
  
 
  
}
