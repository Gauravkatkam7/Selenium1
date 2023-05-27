package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectMultipleCheckboxes4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		List<WebElement> w1 = driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		for(WebElement s1:w1)
		{
			s1.click();
			Thread.sleep(500);
		}
	
	
	
	
	
	
	}
}
