package POM_DDF_TestNg_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage2 {

	@FindBy(xpath="//input[@type=\"password\"]")private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']")WebElement signIn;
	
	public PBPwdPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inpPBPwdPage2pwd(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void clickPBPwdPage2signInBtn()
	{
		signIn.click();
	}
}
