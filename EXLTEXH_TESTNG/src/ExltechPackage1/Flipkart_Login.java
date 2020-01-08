package ExltechPackage1;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Flipkart_Login {
	WebDriver driver;
	By mobile_number= By.xpath("//input[@class='_2zrpKA _1dBPDZ']");
	By  Password=By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']");
	By login=By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']");
	
	
	public void driver(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void mobile(String mobileno)
	{
		driver.findElement(mobile_number).sendKeys(mobileno);
	}
	
	public void pass(String passwrd)
	{
		driver.findElement(Password).sendKeys(passwrd);
	}
	
	public void Log()
	{
		driver.findElement(login).click();
	}
	
	
	public void whole_Login(String strmobile,String strpasword )
	{
		this.mobile(strmobile);
		this.pass(strpasword);
		this.Log();
	}
	
	
	
	
}
