package ExltechPackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazon_logincart {
	WebDriver driver;
	By userFlip = By.xpath("//input[@class='_2zrpKA _14H79F']");
	By conti = By.xpath("//button[@class='_2AkmmA _1poQZq _7UHT_c']");
	By passFlip = By.xpath("//input[@class='_2zrpKA _3v41xv _14H79F']");
	By loginFlip = By.xpath("//button[@class='_2AkmmA _1poQZq _7UHT_c']");
	By cont1 = By.xpath("//button[@class='_2AkmmA _2Q4i61 _7UHT_c']");
	
	public void FlipKart_Login_Cart(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUserName(String strUserName){
        driver.findElement(userFlip).sendKeys(strUserName);
		}
	public void clickContinue(){
        driver.findElement(conti).click();
		}
	
	public void setPassword(String strPassword){
	       driver.findElement(passFlip).sendKeys(strPassword);

		}

public void clickLogin(){
		            driver.findElement(loginFlip).click();
		            
		    }
public void clickContinue1(){
    driver.findElement(cont1).click();
	}

public void loginToFlipKart(String strUserName, String strPassword) {
	
	this.setUserName(strUserName);
	this.clickContinue();
	
	this.setPassword(strPassword);
	this.clickLogin();
	this.clickContinue1();
	
}

}


