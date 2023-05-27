package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcolsize1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int colsize = driver.findElements(By.xpath("//div[@class=\"tableFixHead\"]//tr[4]/td")).size();
		
		System.out.println(colsize);
	
	
	
		}
}
