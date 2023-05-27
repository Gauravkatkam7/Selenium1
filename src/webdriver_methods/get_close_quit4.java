package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class get_close_quit4 {

	public static void main(String[] args) {
		
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");

		driver.quit();
	}
}
