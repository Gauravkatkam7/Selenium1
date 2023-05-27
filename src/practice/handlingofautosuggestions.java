package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingofautosuggestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("redmi");
		Thread.sleep(2000);
		
		List<WebElement> all = driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]//div"));
		String exp="redmi 12c";
		for(WebElement s1:all)
		{
			String text = s1.getText();
			if(text.equals(exp))
			{
				s1.click();
				break;
			}
		}
	
	
	
	
	}
}
