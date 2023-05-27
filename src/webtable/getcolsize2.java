package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcolsize2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int colsize = driver.findElements(By.xpath("//table[@name=\"courses\"]//tr[3]/td")).size();
		
		System.out.println(colsize);
	
	
	
	}
}
