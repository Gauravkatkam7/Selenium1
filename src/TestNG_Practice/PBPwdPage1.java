package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage1 {

	@FindBy(xpath="//input[@type=\"password\"]")private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement signIn;
	
	public PBPwdPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inpPBPwdPage1pwd(String password)
	{
		pwd.sendKeys(password);
	}
	public void clickPBPwdPage1SignInBtn()
	{
		signIn.click();
	}
}
