package EXLTEXH_PACKAGE;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//@Ignore("Throws Null Pointer Exception")
public class NewTest {
	
	 WebDriver driver;
  @Test
  public void f() {
	  
	  
  }
  @BeforeTest
  public void before() throws InterruptedException 
  
  {

		System.setProperty("C:\\geckodriver-v0.26.0-win64\\geckodriver.exe",null);
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement Email=driver.findElement(By.id("email"));
		Email.clear();
		Email.sendKeys("heena123@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys("heenarahul123");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_b")).click();
	  
		
  }
  //@AfterTest
  public void after()
  {
	 driver.close();
  }
}
