package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_title1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("-------");
		System.out.println(driver.getTitle());
	}
}
