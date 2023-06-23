package POM_DDF_TestNg_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLogOutPage1 {

	@FindBy(xpath="//div[@class=\"h_l\"]")private WebElement logOut;
	
	public PBLogOutPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPBLogOutPage1LogOutBtn()
	{
		logOut.click();
	}
}
