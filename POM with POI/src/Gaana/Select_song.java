package Gaana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Select_song {
	WebDriver driver;
	@FindBy(how=How.XPATH,using="//div[1]//div[1]//ul[1]//li[1]//div[1]//div[1]//a[1]//img[1]")
	WebElement song_click;
	
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[3]/div[4]/div[3]/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]/span[1]")
	WebElement play;
	
	@FindBy(className="fill_path orange")
	WebElement pause;
	
	public void driver()
	{
		this.driver=driver;
	}
	
	public void Click_Song() throws InterruptedException
	{
		song_click.click();
		Thread.sleep(2000);
		play.click();
		
	}
	
	

}
