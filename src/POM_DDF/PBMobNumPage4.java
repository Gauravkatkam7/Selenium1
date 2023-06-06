package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage4 {

	@FindBy(xpath="(//input[@type=\"number\"])[2]")private WebElement mobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement signInWithPwd;
	
	public PBMobNumPage4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpPBMobNumPage4mobNum(String mobilenumber)
	{
		mobNum.sendKeys(mobilenumber);
	}
	public void clickPBMobNumPage4SignInWithPwdBtn()
	{
		signInWithPwd.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
