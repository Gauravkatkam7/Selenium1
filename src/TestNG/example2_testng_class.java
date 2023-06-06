package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example2_testng_class {


	@Test
	public void m1() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		Thread.sleep(2000);
		
		driver.quit();
		
	}
	
	
	
}
