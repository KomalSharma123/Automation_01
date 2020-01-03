package POI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	
	@FindBy(id="email")
WebElement strusername;
	
	@FindBy(how=How.ID,using="pass")
	WebElement strpassword;
	
	@FindBy(how=How.XPATH,using="//input[@id='u_0_b']")
	WebElement strsubmit;
	
	public void Login1()
	{
		this.driver=driver;
	}


public void Facebook_login( String username,String password)
{
	strusername.sendKeys(username);
	strpassword.sendKeys(password);
	strsubmit.click();
	
}
}