package Gaana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {
WebDriver driver;
@FindBy(how=How.XPATH,using="//div[@class='search_container']//input[@id='sb']")
WebElement search;

@FindBy(how=How.XPATH,using="//a[@class='search_btn']")
WebElement submit;

public void driver()
{
	this.driver=driver;
}

public void Home_page(String  strsearch)
{
	search.sendKeys(strsearch);
	submit.click();
}




}
