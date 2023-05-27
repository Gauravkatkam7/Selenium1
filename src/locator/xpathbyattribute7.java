package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattribute7 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gkatkam457@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Instagram457@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	}
}
