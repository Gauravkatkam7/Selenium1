package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		WebElement div= driver.findElement(By.xpath("//input[@name='username']"));
	div.sendKeys("airtel");
	Thread.sleep(3000);
	div.clear();
	Thread.sleep(2000);
	div.sendKeys("jio");
	}
}
