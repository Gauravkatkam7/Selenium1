package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("Bank of");
	
		Thread.sleep(2000);
		List<WebElement> bob = driver.findElements(By.xpath("//ul[@jsname=\"bw4e9b\"]/li"));
		String exp="Bank of India";
		for(WebElement w1:bob)
		{
			String s1 = w1.getText();
			if(s1.equals(exp))
			{
				w1.click();
				break;
			}
		}
	
	
	}
}
