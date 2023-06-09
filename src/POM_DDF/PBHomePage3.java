package POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBHomePage3 {

	@FindBy(xpath="//div[text()='My Account']")private WebElement myAcc;
	WebDriver driver1;
	public PBHomePage3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void openDDOptionsPBHomePage3myAcc()
	{
		Actions act=new Actions(driver1);
		act.moveToElement(myAcc).perform();
	}
}
