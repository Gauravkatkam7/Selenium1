package webdriver_methods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class get_title6 {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.mobikwik.com/");
		
		String s1=driver.getTitle();
		System.out.println(s1);
	}
}
