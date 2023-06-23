package POM_DDF_TestNg_BaseClass_UtilityClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {

	WebDriver driver;
	
	public void initializeBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
