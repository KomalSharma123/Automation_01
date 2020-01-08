package ExltechPackage2;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.metal.MetalBorders.Flush3DBorder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ExltechPackage3.Facebook_1;

public class Amazon_Addtocart {
	WebDriver driver;
		
	@Test(priority=1)
	public void Facebook_1() throws InterruptedException
	{
		Amazon_Add obj=new Amazon_Add();
		obj.Amazon_kart(driver);
		obj.clickAddToCart();
		Thread.sleep(2000);
		obj.orderPace();
	}
	@Test(priority=2)
	public void f2()
	{
		Amazon_logincart obj1=new Amazon_logincart();
		obj1.FlipKart_Login_Cart(driver);
		obj1.loginToFlipKart("9554771453", "Sayed55@");
	}
	@Test(priority=3)
	public void F3() throws InterruptedException
	{
		Amazon_Gateway obj3=new Amazon_Gateway();
		obj3.FlipKart_Gateway(driver);
		Thread.sleep(2000);
		obj3.cashOnDelivery();
	}
	
	 @BeforeTest
  public void setup() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("https://www.flipkart.com/");
	  
  }
}

