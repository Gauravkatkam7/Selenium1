package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage3 {

	@FindBy (xpath="(//input[@type=\"number\"])[2]")private WebElement mobNum;
	@FindBy (xpath="(//span[text()='Sign in with Password'])[2]")private WebElement signInWithPwd;
	
	public PBMobNumPage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpPBMobNumPage3MobNum(String mobilenumber)
	{
		mobNum.sendKeys(mobilenumber);
	}
	public void clickPBMobNumPage3SignInWithPwdBtn()
	{
		signInWithPwd.click();
	}









}
