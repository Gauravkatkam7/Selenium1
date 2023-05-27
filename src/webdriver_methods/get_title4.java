package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class get_title4 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		String s1=driver.getTitle();
		
		driver.close();
		
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.youtube.com");
		String s2=dr.getTitle();
	
		System.out.println(s1+"\n"+s2);
	}
	
}
