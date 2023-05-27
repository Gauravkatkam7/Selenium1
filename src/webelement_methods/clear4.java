package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement d1=driver.findElement(By.xpath("//input[@type='text']"));
		d1.sendKeys("gaurav");
		Thread.sleep(3000);
		d1.clear();
	Thread.sleep(3000);
		d1.sendKeys("katakm");
		
	}
}
