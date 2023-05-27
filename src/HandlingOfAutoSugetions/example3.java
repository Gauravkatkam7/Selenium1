package HandlingOfAutoSugetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("samsung");
		Thread.sleep(2000);
		List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]/li"));
		String exptext="samsung s23 ultra";
		for(WebElement s1:alloptions)
		{
			String text = s1.getText();
			if(text.equals(exptext))
			{
				s1.click();
				
			}
		}
	
	
	
	
	}
}
