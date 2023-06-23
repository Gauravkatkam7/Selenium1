package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class error_color {
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void signInToApp() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
	}
	@Test
	public void verifyErrorColor()
	{
		WebElement errormsg = driver.findElement(By.xpath("(//span[@id=\"error-sign-in\"])[2]"));
		String colour = errormsg.getCssValue("color");
		String fontsize = errormsg.getCssValue("font-size");
		String fontweight = errormsg.getCssValue("font-weight");
		String code = Color.fromString(colour).asHex();
		System.out.println(code);
		
		if(code.equals("#de350b"))
		{
			Reporter.log("red in colour",true);
		}
		else
		{
			Reporter.log("Not Red In colour",true);
		}
		
		System.out.println("font size is "+fontsize);
		System.out.println("font weight is "+fontweight);
	}
}
