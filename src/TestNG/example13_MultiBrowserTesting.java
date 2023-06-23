package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class example13_MultiBrowserTesting {

	@Parameters("BrowserName")
	@Test
	public void TC1(String BrowserName) throws InterruptedException
	{
		WebDriver driver=null;
		    //chrome
		if(BrowserName.equals("chrome"))
		{
			 driver=new ChromeDriver();
		}
		else if(BrowserName.equals("firefox"))
		{
			 driver=new FirefoxDriver();
		}
		else if(BrowserName.equals("edge"))
		{
			 driver=new EdgeDriver();
		}
		
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
		
	}
}
