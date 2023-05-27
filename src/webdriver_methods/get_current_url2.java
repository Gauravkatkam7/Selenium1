package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class get_current_url2 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		
		String s1=driver.getCurrentUrl();
		System.out.println(s1);
		
	}
}
