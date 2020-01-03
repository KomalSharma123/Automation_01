package POI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Home {
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//span[@class='_1vp5']")
	WebElement strclick;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Photos')]")
	
	WebElement strphoto;
	
	public void home() throws InterruptedException
	{
		strclick.click();
		Thread.sleep(2000);
		strphoto.click();
	}
	
	

}
