package ExltechPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Flipkart_Home {
	WebDriver driver;
	By userName=By.xpath("//body/div[@id='container']/div/div[@class='_3ybBIU']/div[@class='_1tz-RS']/div[@class='_3pNZKl']/div[3]/div[1]");

	public void driver(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public String gettext()
	{
		return driver.findElement(userName).getText();
	}
	
	
	
}
