package POM_DDF;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage4 {

	@FindBy (xpath="//input[@name=\"personName\"]")private WebElement fullName;
	WebDriver driver1;
	public PBProfilePage4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void switchToChildwindow()
	{
		Set<String> allId = driver1.getWindowHandles();
		ArrayList<String>ar=new ArrayList<>(allId);
		driver1.switchTo().window(ar.get(1));
	}
	public void verifyPBProfilePage4FullName(String expectedname)
	{
		String actName = fullName.getAttribute("value");
		String expName =expectedname;
		
		if(expName.equals(actName))
		{
			System.out.println("Tc Pass");
		}
		else
		{
			System.out.println("TC fail");
		}
	}
}
