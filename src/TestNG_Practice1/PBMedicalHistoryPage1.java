package TestNG_Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMedicalHistoryPage1 {

	@FindBy(xpath="(//input[@type=\"checkbox\"])[3]")private WebElement noneOfThese;
//	@FindBy(xpath="//span[text()='View plans']")private WebElement viewPlans;
	
	public PBMedicalHistoryPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickCheckBoxPBMedicalHistoryPage1NoneOfThese()
	{
		noneOfThese.click();
	}
//	
//	public void clickPBMedicalHistoryPage1ViewPlans()
//	{
//		viewPlans.click();
//	}
}
