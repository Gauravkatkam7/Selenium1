package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
	
		 WebElement text=driver.findElement(By.xpath("//input[contains(@class,'_ac4d')]"));
		 text.sendKeys("how are you");
		 
		
	}
}
