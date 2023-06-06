package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPage4 {

	@FindBy(xpath="//span[text()=' My profile ']") private WebElement myProfile;
	
	public PBMyAccPage4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPBMyAccPage4MyProfileBtn()
	{
		myProfile.click();
	}
}
