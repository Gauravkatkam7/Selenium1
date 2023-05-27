package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_current_url5 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/");
		String s1=driver.getCurrentUrl();
		System.out.println(s1);
	}
}
