package ExltechPackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Orange_hrm
{
	WebDriver driver;
	
	@Test(priority=0)
	public void f8()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
 @Test(priority=1)
  public void f() 
 	{
	 WebElement obj=driver.findElement(By.id("txtUsername"));
		obj.clear();
		obj.sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList");
	  }
 @Test(priority=2)
 public void f1() throws InterruptedException
 {
	 driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Rakesh");
		driver.findElement(By.id("empsearch_id")).sendKeys("E001");
		Select obj4= new Select(driver.findElement(By.id("empsearch_employee_status")));
		obj4.selectByValue("1");
		
		Select obj5=new Select(driver.findElement(By.xpath("//select[@id='empsearch_termination']")));
		obj5.selectByValue("1");
		 driver.findElement(By.xpath("//input[@id='empsearch_supervisor_name']")).sendKeys("Mahesh sharma");
	 
 }
 
 @BeforeTest
 public void test1()
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
