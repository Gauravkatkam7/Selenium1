package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage4 {

	@FindBy(xpath="//input[@type=\"password\"]")private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement signIn;
	
	
	public PBPwdPage4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inpPBPwdPage4Pwd(String password)
	{
		pwd.sendKeys(password);
	}
	public void clickPBPwdPage4signInBtn()
	{
		signIn.click();
	}
}
