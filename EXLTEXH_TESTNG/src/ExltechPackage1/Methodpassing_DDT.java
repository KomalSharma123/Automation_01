package ExltechPackage1;

import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;


public class Methodpassing_DDT {
	WebDriver driver;
	@BeforeTest
	public void f()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
	}
  @Test(dataProvider = "Google")
  public void MethodA(String Username, String password) 
  {
	  
	  
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  WebElement element=driver.findElement(By.name("q"));
	  element.sendKeys(Username);
	  System.out.println("username is" +Username+ "and password is" +password);  
	  
  }
  @Test(dataProvider="Google")
  public void MethodB(String Username) 
  {
	  
	 
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  WebElement element=driver.findElement(By.name("q"));
	  element.sendKeys(Username);
	  System.out.println("username is" +Username);  
	  
  }

  @DataProvider(name="Google")
  public Object[][] getDataFromDataprovider(Method m) {
    if(m.getName().equalsIgnoreCase("testmethoda")){
    	return new Object[][] {
      new Object[] { "Komal", "Komal123" },
      new Object[] { "Geeta", "Geeta123" }
    };}
    else 
    {
    
    
    	return new Object[][] {
    	{ "Komal" },
        { "Geeta" }
  };
}
}
}
