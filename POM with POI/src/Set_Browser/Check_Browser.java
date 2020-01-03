package Set_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Check_Browser {
	
	static WebDriver driver;
	public  static  WebDriver startbrowser(String Brower_name,String url) 
	{
		
		if(Brower_name.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (Brower_name.equalsIgnoreCase("chromedriver")) 
		{
			
			driver=new ChromeDriver();
		}
		else if (Brower_name.equalsIgnoreCase("Internetexplorer"))
				 {
				
			driver=new InternetExplorerDriver();
		}
		
		driver.get(url);
		return driver;
		
	}
	
	
	

	
	

}
