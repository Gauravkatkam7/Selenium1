package POM_DDF_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPage3 {

	@FindBy(xpath="//span[text()=' My profile ']")private WebElement myProfile;
	
	public  PBMyAccPage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPBMyAccPage1MyProfileBtn()
	{
		myProfile.click();
	}
















}
