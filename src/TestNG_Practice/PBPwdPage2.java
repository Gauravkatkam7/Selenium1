package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage2 {

	@FindBy(xpath="//input[@name=\"password\"]")WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']")WebElement signIn;
	
	public PBPwdPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpPBPwdPage2Pwd(String password)
	{
		pwd.sendKeys(password);
	}
	public void clickPBPwdPage2SignIn()
	{
		signIn.click();
	}











}
