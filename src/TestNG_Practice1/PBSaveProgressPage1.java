package TestNG_Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBSaveProgressPage1 {

	@FindBy(xpath="//input[@id=\"fullName\"]")private WebElement fullName;
	@FindBy(xpath="//input[@id=\"mobile\"]")private WebElement mobNum;
	@FindBy(xpath="//button[text()=' Continue ›']")private WebElement continue1;
	
	public PBSaveProgressPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpPBSaveProgressPage1FullName(String fullname)
	{
		fullName.sendKeys(fullname);
	}
	
	public void inpPBSaveProgressPage1MobNum(String mobilenumber)
	{
		mobNum.sendKeys(mobilenumber);
	}
	public void clickPBSaveProgressPage1ContinueBtn()
	{
		continue1.click();
	}
}
