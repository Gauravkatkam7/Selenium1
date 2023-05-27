package dynamicelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("boat watch");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		String text = driver.findElement(By.xpath("((//div[@class=\"rush-component s-featured-result-item \"])[1]//span)[16]")).getText();
		System.out.println(text);
	}
}
