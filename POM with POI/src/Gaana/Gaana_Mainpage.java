package Gaana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POI.Login;
import Set_Browser.Check_Browser;

public class Gaana_Mainpage {
	WebDriver driver;
	
	@Test
	public void Ganna_Select() throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=Check_Browser.startbrowser("Firefox", "https://gaana.com/");
		Homepage obj=PageFactory.initElements(driver,Homepage.class);
		obj.Home_page("kal ho na ho");
		Select_song obj1=PageFactory.initElements(driver,Select_song.class);
		//Thread.sleep(2000);
		obj1.Click_Song();
	}
	
}

