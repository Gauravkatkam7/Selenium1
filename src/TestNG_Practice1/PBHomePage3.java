package TestNG_Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBHomePage3 {

	@FindBy(xpath="(//i[@class=\"icon-bg homeIconsBg health-insurance\"])[2]")private WebElement healthCare;
	
	public PBHomePage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPBHomePage3HealthCareLink()
	{
		healthCare.click();
	}
}
