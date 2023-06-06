package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage3 {

	@FindBy(xpath="//input[@type=\"password\"]")private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement signIn;
	
	public PBPwdPage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inpPBPwdPage3Pwd(String password)
	{
		pwd.sendKeys(password);
	}
	public void clickPBPwdPage3SignInBtn()
	{
		signIn.click();
	}
}
