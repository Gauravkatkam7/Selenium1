package POM_DDF_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage2 {

	@FindBy(xpath="(//input[@type=\"number\"])[2]")private WebElement mobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")WebElement signInWithPwd;
	
	public  PBMobNumPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void inpPBMobNumPage2mobNum(String mobilenumber)
	{
		mobNum.sendKeys(mobilenumber);
	}
	
	public void clickSignInWithPwdBtn()
	{
		signInWithPwd.click();
	}













}
