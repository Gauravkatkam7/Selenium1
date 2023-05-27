package dynamicelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("samsung s23 ultra");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//div[@class=\"_2kHMtA\"]//span)[8]")).getText();
		System.out.println(text);
		
	}
}
