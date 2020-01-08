package ExltechPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_1 
{
	WebDriver driver;

	@Test(priority=0)
	public void f8()
	{
		driver.get("https://www.amazon.in/");
	}
	
 @Test(priority=1)
  public void f() 
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
 public void f1() throws InterruptedException
 {
	 Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='desktop-ysh-np-cards_ShowcaseStrategy_1571283031']//div[@class='overlay']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[1]//div[1]//div[1]//a[1]//div[1]//img[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='size-chart-url']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'a-button-close a-declarative')]")).click();
		Select obj=new Select(driver.findElement(By.id("native_dropdown_selected_size_name")));
		obj.selectByVisibleText("6 UK");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='hlb-ptc-btn-native']")).click();
	 
 }
 @Test(priority=3)
 public void set()
 {
	 driver.findElement(By.xpath("//input[@id='enterAddressPostalCode']")).sendKeys("311406");
	 //driver.findElement(By.xpath("))
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
