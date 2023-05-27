package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class minimize4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver1.manage().window().minimize();
		
		WebDriver driver2=new EdgeDriver();
		driver2.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver2.manage().window().minimize();
	}
}
