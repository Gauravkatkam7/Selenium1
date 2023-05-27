package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='db']")).sendKeys("pune");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='db'])[2]")).sendKeys("mumbai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(@class,'icon-calendar')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@class='wd day']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
	}
}
