package TestNG_practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example10_Parallel1 {

	@Test
	public void TC1() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		
		Thread.sleep(4000);
		driver.quit();
	}
}
