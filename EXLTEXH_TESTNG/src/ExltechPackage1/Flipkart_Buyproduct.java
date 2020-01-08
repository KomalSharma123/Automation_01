package ExltechPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Flipkart_Buyproduct {
	WebDriver driver;
	By add=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]");
	By size=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
	
	public void driver(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Size_add()
	{
		driver.findElement(size).click();}	
	public void Add_cart()
	
	{
		driver.findElement(add).click();
	}
	
	
	   
	
	

}
