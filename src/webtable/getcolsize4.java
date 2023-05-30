package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcolsize4 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int size = driver.findElements(By.xpath("(//table[@id='product'])[2]//tr[3]/td")).size();
		System.out.println(size);
	
	
	}
}
