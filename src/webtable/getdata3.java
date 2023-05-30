package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdata3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String text = driver.findElement(By.xpath("(//table[@id=\"product\"]//tr)[3]/td[2]")).getText();
		System.out.println(text);
		
	}
}
