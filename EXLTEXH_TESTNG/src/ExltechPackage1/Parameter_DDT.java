package ExltechPackage1;

import org.testng.annotations.Test;

import ExltechPackage3.Facebook_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Parameter_DDT {
	WebDriver driver;
	@BeforeTest
	public void Facebook_1()
	{
		
		  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
	}
  @Test(dataProvider = "Myntra")
  public void f(String username,String password)
  {
	  
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  WebElement element=driver.findElement(By.name("q"));
	  element.sendKeys(username);
	  System.out.println("username is" +username+ "and password is" +password);
	  
}

  @DataProvider(name="Myntra")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"Komal","Komal123"},
      new Object[] { "Geeta","Geeta123"}
    };
  }
}
