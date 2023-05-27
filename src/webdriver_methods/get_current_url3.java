package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class get_current_url3 {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.mi.com/");
		
		String s1=driver.getCurrentUrl();
		System.out.println(s1);
	}
}
