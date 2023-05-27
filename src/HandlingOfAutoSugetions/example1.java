package HandlingOfAutoSugetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("redmi");
		Thread.sleep(2000);
		List<WebElement> alloption = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]/li"));
		
		String exptext="redmi 12c";
		for(WebElement s1:alloption)
		{
			String text = s1.getText();
			if(text.equals(exptext))
			{
				s1.click();
				break;
			}
		}
	
	
	
	
	}

}
