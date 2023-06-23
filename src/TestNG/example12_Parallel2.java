package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example12_Parallel2 {

	@Test
	public void TC1() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		driver.close();
	}
}
