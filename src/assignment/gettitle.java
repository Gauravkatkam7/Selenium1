package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://meet.google.com/auk-sjfj-uzr");
		String title=driver.getTitle();
		System.out.println(title);
	}
}
