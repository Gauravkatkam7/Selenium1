package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdata2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String text = driver.findElement(By.xpath("(//table[@id=\"product\"])[2]//tr[5]/td[3]")).getText();
		System.out.println(text);
	
	}
}
