package TestNG_Practice1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBGenderPage1 {

	@FindBy(xpath="//button[text()=' Continue › ']")private WebElement continue1;
	WebDriver driver1;
	public PBGenderPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void scrollToPBGenderPage1ContinueBtn()
	{
		((JavascriptExecutor)driver1).executeScript("arguments[0].scrollIntoView(true);",continue1);
	}
	
	public void clickPBGenderPage1ContinueBtn()
	{
		continue1.click();
	}
}
