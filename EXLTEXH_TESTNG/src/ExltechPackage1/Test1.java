package ExltechPackage1;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	 driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("email")).sendKeys("sharma1993k@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("Lubnakomal");
	  //Thread.sleep(2000);
	  //driver.findElement(By.xpath("//input[@id='u_0_c']")).submit();
  }
	  
	  
	  
  
}
