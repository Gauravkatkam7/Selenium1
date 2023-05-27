package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdata1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String text = driver.findElement(By.xpath("//table[@name=\"courses\"]//tr[9]/td[2]")).getText();
		
		System.out.println(text);
	
	
	}
}
