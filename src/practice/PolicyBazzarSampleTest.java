package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PolicyBazzarSampleTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type=\"number\"])[2]")).sendKeys("7020790545");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(@class,\"cl-btn sr-btn\")])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Gaurav@8382");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"shadowHandlerBox\"]")).click();
	
		Thread.sleep(2000);
		driver.navigate().to("https://www.policybazaar.com/");
	}
}
