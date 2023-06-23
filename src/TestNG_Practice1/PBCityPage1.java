package TestNG_Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBCityPage1 {

	@FindBy(xpath="//li[text()='Pune']")private WebElement city;
	
	public PBCityPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPBCityPage1City()
	{
		city.click();
	}
}
