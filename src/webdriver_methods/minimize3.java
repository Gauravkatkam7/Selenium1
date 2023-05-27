package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class minimize3 {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().minimize();
	}
}
