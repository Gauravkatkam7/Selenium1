package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLogOutPage2 {

	@FindBy(xpath="//div[@class=\"h_l\"]")private WebElement logOut;
	
	public PBLogOutPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickPBLogOutPage2LogOutBtn()
	{
		logOut.click();
	}
}
