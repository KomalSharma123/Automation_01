package ExltechPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flipkart_Product {
	WebDriver driver;
	By men=By.xpath("//span[contains(text(),'TVs & Appliances')]");
	//By product=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]");
	//By SelectProduct=By.xpath("//li[2]//ul[1]//li[1]//ul[1]//li[1]//ul[1]//li[7]//a[1]");
	By SelectProduct=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[8]/a[1]");
	
	
	
	public void driver(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void men_shop()
	{
		driver.findElement(men).click();
		//driver.findElement(product).click();
	}
	
	
	public void ProductSelect()
	{
		driver.findElement(SelectProduct).click();
	}
	
	public void Product_page() throws InterruptedException
	{
		this.men_shop();
		//this.product_in();
		this.ProductSelect();
	}
	

}
