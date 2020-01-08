package ExltechPackage3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_main {
	WebDriver driver;
	@BeforeTest
	public void f1()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	
  @Test(priority=0)
  public void f() throws InterruptedException 
  {
	  Amazon_login obj=new Amazon_login();
	  obj.driver(driver);
	  obj.Login_all("8112268400", "Heena@123$");
  }
}
