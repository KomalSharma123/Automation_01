package POI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Set_Browser.Check_Browser;

public class Verify_login
{
	@Test
	public void Check_validUser() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=Check_Browser.startbrowser("Firefox", "https://www.facebook.com/");
		Login obj=PageFactory.initElements(driver,Login.class);
		obj.Facebook_login("sharma1993k@gmail.com", "lubnakomal");
		Home obj1=PageFactory.initElements(driver, Home.class);
		obj1.home();
		
		
		
		
		
	}
	

}
