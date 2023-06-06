package POM_DDF;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage5 {

	@FindBy(xpath="//input[@name=\"personName\"]")private WebElement fullName;
	WebDriver driver1;
	public PBProfilePage5(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void switchToChildBrowser()
	{
		Set<String> allId = driver1.getWindowHandles();
		ArrayList<String>ar=new ArrayList<>(allId);
		driver1.switchTo().window(ar.get(1));
	}
	public void verifyPBProfilePage5FullName(String expectedname)
	{
		String actName = fullName.getAttribute("value");
		String expName=expectedname;
		if(expName.equals(actName))
		{
			System.out.println("TC pass");
		}
		else
		{
			System.out.println("TC fail");
		}
	}
}
