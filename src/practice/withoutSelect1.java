package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutSelect1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.findElement(By.xpath("//a[@class=\"dropdown-toggle\"]")).click();
		Thread.sleep(2000);
		List<WebElement> allElements = driver.findElements(By.xpath("(//ul[@class=\"dropdown-menu\"])[1]//li/a"));
		for(WebElement s1:allElements)
		{
			String expText="Login";
			String text = s1.getText();
			System.out.println(text);
			if(text.equals(expText))
			{
				s1.click();
				break;
			}
		}
	
	
	
	}
}
