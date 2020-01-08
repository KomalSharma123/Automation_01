package EXLTEXH_PACKAGE;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_Test {
	public WebDriver driver;
  @Test(priority=0)
  public void f()
  	{
	  driver.get("https://www.amazon.in/");
	  
	}
  @Test(priority=1)
  public void test()
  {
	  driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]"));
		WebElement element=driver.findElement(By.xpath("//div[@class='nav-signin-tooltip-footer']//a[@class='nav-a'][contains(text(),'Start here.')]"));
		element.click();
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Heena");
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("8112268400");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Heena@123$");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
  }
  @Test(priority=2)
  public void test3() throws InterruptedException
  {
	 driver.findElement(By.xpath("//a[contains(text(),'Customer Service')]")).click();
	 driver.get("https://www.amazon.in/gp/yourstore/home?ie=UTF8&ref_=nav_custrec_newcust&");
	 Thread.sleep(2000);
	 
  }
  @Test(priority=3)
  public void test4() throws InterruptedException
  {
	  driver.findElement(By.xpath("//div[@id='desktop-ysh-np-cards_CategoryBasedNewReleasesStrategy_1661666031']//div[@class='overlay']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//li[2]//div[1]//div[1]//a[1]//div[1]//img[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='submit.add-to-registry.wishlist']")).click();
  }
  @Test(priority=4)
public void test5() 
{
	  driver.findElement(By.xpath("//div[@class='firstCreate']//a//img")).click();
}
  
  
  @BeforeTest
  public void test1()
  {
  
	  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
  }
  
  @AfterTest
  public void test2()
  {
	  driver.close();
  }
  
  
}
