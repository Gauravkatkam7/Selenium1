package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyindex2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(@class,'_aaco ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("7020790545");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("gaurav santosh katkam");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("katkamgaurav");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("gaurav");
	}
}
