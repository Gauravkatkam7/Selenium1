package TestNG_practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class example11_MultiBrowsingTesting {

	WebDriver driver;
	
		@Parameters("browserName")
		@Test
		public void sample(String browserName) throws InterruptedException
		{
			if(browserName.equals("chrome"))
			{
				 driver=new ChromeDriver();
			}
			else if(browserName.equals("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else if(browserName.equals("edge"))
			{
				driver=new EdgeDriver();
			}
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(2000);
			driver.quit();
		}
	
}
