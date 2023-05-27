package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("flipkar");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Flipkart']")).click();
	}
}
