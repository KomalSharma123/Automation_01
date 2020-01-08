package ExltechPackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazon_Gateway {
WebDriver driver;
	
	By cod = By.xpath("//body/div[@id='container']/div/div[@class='_1Ua1Gl']/div[@class='row _2e3-6j']/div[@class='_3B4tat']/div[@class='_1GRhLX _38vNoF']/div[@class='_3K1hJZ']/div[@class='foVA5Z']/div[@class='_1GRhLX _17_fE5']/div/label[4]/div[1]");

	public void FlipKart_Gateway(WebDriver driver) {
		this.driver = driver;
	}
	public void cashOnDelivery(){
	    driver.findElement(cod).click();
		}

}


