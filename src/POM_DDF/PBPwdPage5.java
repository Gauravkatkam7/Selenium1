package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage5 {

	@FindBy(xpath="//input[@type=\"password\"]")private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']")WebElement signIn;
	
	public PBPwdPage5(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpPBPwdPage5Pwd(String password)
	{
		pwd.sendKeys(password);
	}
	public void clickPBPwdPage5SignInBtn()
	{
		signIn.click();
	}
}
