package ExltechPackage3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook_1
{
	public WebDriver driver;

    @BeforeTest
    public void startBrowser() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
       
        driver=new FirefoxDriver();
    }
    
  @Test
  public void f() throws InterruptedException  {
	  
	  driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
  	
	
	 
	driver.manage().window().maximize();
	WebElement Email=driver.findElement(By.id("email"));
	Email.clear();
	Email.sendKeys("sharma1993k@gmail.com");
	WebElement password=driver.findElement(By.id("pass"));
	password.clear();
	password.sendKeys("lubnakomal");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='u_0_c']")).submit();
	
	
  }
}
