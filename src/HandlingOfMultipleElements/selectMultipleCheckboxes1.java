package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectMultipleCheckboxes1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	for(WebElement s1:checkboxes)
	{
		s1.click();
		Thread.sleep(500);
	}
//	for(int i=checkboxes.size()-1;i>=0;i--)
//	{
//		checkboxes.get(i).click();
//		Thread.sleep(500);
//	}
	
	
	
	}

}
