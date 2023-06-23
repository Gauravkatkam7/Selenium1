package POM_DDF_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLogOutPage3 {

	@FindBy(xpath="//div[@class=\"h_l\"]")private WebElement logOut;
	
	public PBLogOutPage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPBLogOutPage3LogOutBtn()
	{
		logOut.click();
	}
}
