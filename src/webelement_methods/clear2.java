package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("gaurav katkam");
		Thread.sleep(3000);
		text.clear();
		Thread.sleep(3000);
		text.sendKeys("santosh");
	}
}
