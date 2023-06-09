package TestNG_Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class PBProfilePage2 {

	@FindBy(xpath="//input[@name=\"personName\"]")private WebElement fullName;
	WebDriver driver1;
	public PBProfilePage2(WebDriver driver)
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
	
	public void verifyPBProfilePage2FullName(String expectename)
	{
		String actName = fullName.getAttribute("value");
		String expName=expectename;
		if(expName.equals(actName))
		{
			Reporter.log("TC Pass",true);
		}
		else
		{
			Reporter.log("TC Fail",true);
		}
	}










}
