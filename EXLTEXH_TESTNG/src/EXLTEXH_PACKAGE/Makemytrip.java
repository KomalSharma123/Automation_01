package EXLTEXH_PACKAGE;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.description.modifier.MethodManifestation;

public class Makemytrip {
	WebDriver driver;
	
	@Test(priority=0)
	public void f1()
	{
		driver.get("https://www.makemytrip.com/");
	}
	
	@Test(priority=1)
	public void f12() throws InterruptedException
	{
		WebElement element=driver.findElement(By.xpath("//span[contains(text(),'From')]"));
		element.click();
		WebElement element2=driver.findElement(By.xpath("//input[contains(@placeholder,'From')]"));
		element2.sendKeys("Pune");
		element2.click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement mmtFrom = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']//p[contains(@class,'font14 appendBottom5 blackText')][contains(text(),'Pune, India')]")));
		mmtFrom.click();
		WebElement element3=driver.findElement(By.xpath("//span[contains(text(),'To')]"));
		element3.click();
		WebElement element4=driver.findElement(By.xpath("//input[contains(@placeholder,'To')]"));
		element4.sendKeys("Bangkok");
		element4.click();
		WebElement mmtTo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']//p[contains(@class,'font14 appendBottom5 blackText')][contains(text(),'Bangkok, Thailand')]")));
		mmtTo.click();
		
	}
	
  @Test(priority=2)
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'DayPicker-wrapper')]//div[1]//div[3]//div[4]//div[7]//div[1]//p[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'RETURN')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Months')]//div[2]//div[3]//div[1]//div[7]//div[1]//p[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement mmtSearch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'primaryBtn font24 latoBlack widgetSearchBtn')]")));
		mmtSearch.click();
//		Thread.sleep(2000);
		WebElement mmtSearch2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='fli_primary_btn text-uppercase ']")));
		//WebElement mmtSearch2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='bookbutton-RKEY:c97055a4-f8b8-43b6-bd67-884b3bff1ceb:0~~~RKEY:c97055a4-f8b8-43b6-bd67-884b3bff1ceb:34']")));
		mmtSearch2.click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='fli_primary_btn btn text-uppercase continue_cta ']")).click();
  }
  @Test(priority=3)
  public void f2() throws InterruptedException
  {
	  JavascriptExecutor js = (JavascriptExecutor) driver;  
	   js.executeScript("window.scrollBy(0,2399)");
	   driver.findElement(By.xpath("//button[@id='review-continue']")).click();
	 // WebDriverWait wait = new WebDriverWait(driver,10);
	 // WebElement mmtContinue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='review-continue']")));
	 // mmtContinue.click();
	
	//button[@id='review-continue']
  }
  @BeforeTest()
  public void f21()
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
  }
  
  @AfterTest
  public void test2()
  {
	  driver.close();
  
  }
}
