package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingofautosuggestions2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("samsung");
		Thread.sleep(2000);
		List<WebElement> all = driver.findElements(By.xpath("//ul[@class=\"col-12-12 _1MRYA1 _38UFBk\"]//li"));
		String exp="samsung fridge";
		for(WebElement s1:all)
		{
			String text=s1.getText();
			if(text.equals(exp))
			{
				s1.click();
			}
			
		}
		
	}
}
