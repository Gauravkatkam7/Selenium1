package POM_DDF_TestNg_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPage2 {

	@FindBy(xpath="//span[text()=' My profile ']")private WebElement myProfile;
	
	public PBMyAccPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPBMyAccPage2myProfile()
	{
		myProfile.click();
	}






}
