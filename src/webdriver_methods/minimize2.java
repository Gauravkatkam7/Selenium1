package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class minimize2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
	}
}
