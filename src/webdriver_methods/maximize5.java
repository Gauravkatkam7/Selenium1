package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class maximize5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
	}
}
