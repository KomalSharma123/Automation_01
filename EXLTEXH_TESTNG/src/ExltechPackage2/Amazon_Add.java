package ExltechPackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazon_Add {
WebDriver driver;
	
	By addToCart = By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']");
	By placeTheOrder = By.xpath("//button[@class='_2AkmmA iwYpF9 _7UHT_c']");

	
	public void Amazon_kart(WebDriver driver) {

		this.driver = driver;
		
	}
	
	
	public void clickAddToCart() throws InterruptedException {

driver.get("https://www.flipkart.com/penadia-latest-super-loco-motive-train-multicolor/p/itmfdkb3zbpb2c8f?pid=RCTFDKFPTZZG2EWB&lid=LSTRCTFDKFPTZZG2EWBSL0FNR&marketplace=FLIPKART&srno=b_1_1&otracker=nmenu_sub_Baby%20%26%20Kids_0_Remote%20Control%20Toys&fm=organic&iid=en_MkrkRC2qC0Dxsf2RXbBcMpJ2tw2MKPDIEOoFX6EFZi5Jiuvp7m0%2FdTssQ0qE2GiA%2FXKRKru19cn40%2FVYRC6PZQ%3D%3D&ppt=browse&ppn=browse&ssid=akts16ssrdqornk01574919338824");

		driver.findElement(addToCart).click();
	}
	
	public void orderPace() throws InterruptedException {
		
		driver.findElement(placeTheOrder).click();
		
	}

	

}





