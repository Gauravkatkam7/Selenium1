package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SimplePomexample 
{
	private WebElement signIn;
	
	public SimplePomexample(WebDriver driver)
	{
		signIn=driver.findElement(By.xpath("//a[text()='Sign in']"));
	}
	
	public void clickPBLoginPage1SignIn()
	{
		signIn.click();
	}

	
}
