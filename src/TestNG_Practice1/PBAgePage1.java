package TestNG_Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PBAgePage1 {

	@FindBy(xpath="//select[@id=\"Self\"]")private WebElement yourAge;
	@FindBy(xpath="//button[text()=' Continue › ']")private WebElement continue1;
	
	public PBAgePage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectPBAgePage1Age() throws InterruptedException
	{
		Select s1=new Select(yourAge);
		s1.selectByValue("22");
	}
	public void clickPBAgePage1continue1Btn()
	{
		continue1.click();
	}
}
