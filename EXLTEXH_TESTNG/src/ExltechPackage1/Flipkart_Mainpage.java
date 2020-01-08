package ExltechPackage1;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import javax.print.attribute.standard.MediaName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart_Mainpage {
	WebDriver driver;
	@BeforeTest
	public void MediaName()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
	}
	@Test(priority=1)
  public void f() 
	{
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=2)
	public void fp()
	{
		Flipkart_Login fLogin= new Flipkart_Login();
		fLogin.driver(driver);
		fLogin.whole_Login("8390797320", "Ayu@1596");
	}
	
	@Test(priority=3)
	public void fp1() throws InterruptedException
	{
		Flipkart_Home fHome=new Flipkart_Home();
		fHome.driver(driver);
		String Username=fHome.gettext();
		System.out.println("username is:"+Username);
	}
	
	@Test(priority=3)
	public void fp2() throws InterruptedException
	{
		
		Flipkart_Product fpFlipkart_Product=new Flipkart_Product();
		fpFlipkart_Product.driver(driver);
		Thread.sleep(3000);
		fpFlipkart_Product.Product_page();
	}
	
	
	@Test(priority=4)
	public void fp3() throws InterruptedException
	{
		Flipkart_Buyproduct fBuyproduct=new Flipkart_Buyproduct();
		fBuyproduct.driver(driver);
		//driver.get("https://www.flipkart.com/thomson-b9-pro-80cm-32-inch-hd-ready-led-smart-tv/p/itmf5yyhppqrnmsn?pid=TVSF5YYHXKYHVGF6&srno=b_1_1&otracker=browse&lid=LSTTVSF5YYHXKYHVGF6ZHWJUV&fm=organic&iid=c9959c72-6944-45f6-a45b-4a04b9df245b.TVSF5YYHXKYHVGF6.SEARCH&ssid=rk834pr9a80000001575005605043");
		
		//Thread.sleep(2000);
		
		//fBuyproduct.Size_add();
		Thread.sleep(2000);
		fBuyproduct.Add_cart();
		
	}
}
