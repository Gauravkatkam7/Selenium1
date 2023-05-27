package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getrowsize2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int rowsize = driver.findElements(By.xpath("//div[@class=\"tableFixHead\"]//tr")).size();
		
		System.out.println(rowsize);
	
	
	}
}
