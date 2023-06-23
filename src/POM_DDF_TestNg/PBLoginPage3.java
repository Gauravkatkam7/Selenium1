package POM_DDF_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage3 {

	@FindBy(xpath="//a[text()='Sign in']")private WebElement signIn;
	
	public PBLoginPage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPBLoginPage2SignIn()
	{
		signIn.click();
	}
}