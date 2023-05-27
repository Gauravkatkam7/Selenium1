package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyindex1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("gaurav");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("katakm");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("7020790545");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("gauravkatkam");
	            Thread.sleep(3000);
	            
	   driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("12");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("mar");
	   Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("2001");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//label[text()='Male']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	            
	}
}
