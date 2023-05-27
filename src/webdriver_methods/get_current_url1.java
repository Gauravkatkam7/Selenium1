package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_current_url1 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mobikwik.com/");
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
}
