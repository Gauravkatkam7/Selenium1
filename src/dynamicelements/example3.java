package dynamicelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("samsung");
		
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		
		String text = driver.findElement(By.xpath("((//div[@class=\"_4ddWXP\"])[1]//span)[2]")).getText();
	
		System.out.println(text);
	
	
	}
}
