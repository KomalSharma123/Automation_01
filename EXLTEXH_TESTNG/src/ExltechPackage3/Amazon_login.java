package ExltechPackage3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazon_login {
	WebDriver driver;
	By sign_in=By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]");
	//By Sign_in_btn=By.className("nav-action-inner");
	By login=By.xpath("//input[@id='ap_email']");
	By cont_btn=By.xpath("//input[@id='continue']");
	By Password=By.xpath("//input[@id='ap_password']");
	By Login_btn=By.xpath("//input[@id='signInSubmit']");
	
	
	public void driver(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void sign() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(sign_in).click();
		
		//driver.findElement(Sign_in_btn).click();
	}
	
	public void log(String Log)
	{
		driver.findElement(login).sendKeys(Log);
	}
	public void Continue()
	{
		driver.findElement(cont_btn);
	}
	public void pass(String password)
	{
		driver.findElement(Password).sendKeys(password);
	}
	public void login_btn()
	{
		driver.findElement(Login_btn).click();
	}
	
	public void Login_all(String strlog,String strpassword) throws InterruptedException
	{
		this.sign();
		this.log(strlog);
		this.Continue();
		this.pass(strpassword);
		this.login_btn();
	}
}
