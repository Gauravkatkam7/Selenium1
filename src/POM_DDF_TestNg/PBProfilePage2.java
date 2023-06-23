package POM_DDF_TestNg;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		Set<String> allid = driver1.getWindowHandles();
		ArrayList<String>ar=new ArrayList<String>(allid);
		driver1.switchTo().window(ar.get(1));
	}
	
	public String getActResultPBProfilePage2fullName()
	{
		String actValue = fullName.getAttribute("value");
		return actValue;
	}
















}
