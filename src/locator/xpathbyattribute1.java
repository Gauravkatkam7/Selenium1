package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattribute1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("gaurav");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
