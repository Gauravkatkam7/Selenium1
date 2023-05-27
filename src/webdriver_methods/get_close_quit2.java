package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class get_close_quit2 {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.close();
		driver.quit();
	}
}
