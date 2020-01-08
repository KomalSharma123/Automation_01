package ExltechPackage1;

import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DDTusingGropus {
	WebDriver driver;
	@BeforeTest(groups={"A","B"})
	public void f()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		  	driver.manage().window().maximize();
	}
  @Test(dataProvider = "Facebook",groups="A")
  public void MethodA(String Username, String password) throws InterruptedException 
  {
	  	
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys(Username);
		WebElement element=driver.findElement(By.id("pass"));
		element.sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='u_0_c']")).submit();
		
	  
  }
  @Test(dataProvider="Facebook",groups="B")
  public void MethodB(String Username) throws InterruptedException 
  {
	  
	  	driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	  	driver.manage().window().maximize();
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys(Username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='u_0_c']")).submit();
	}

  @DataProvider(name="Facebook")
  public Object[][] dp(ITestContext m) {
	  //Object[][] groupArray=null;
    for(String group:m.getIncludedGroups()){
    	if(group.equalsIgnoreCase("A")){
    		return new Object[][]{
    			  { "sharma1993k@gmail.com", "lubnaKomal" },
    			  { "Geeta", "Geeta123" }
    };
   // break;
    	}
    	
    	else if(group.equalsIgnoreCase("B"))
    	{
    	
     return new  Object[][] {
    	{ "Komal" },
        { "Geeta" }
  };
    	}
    	//break;
    }
	return null;

    //Object[][] groupArray = null;
	//return groupArray;
}
  }
