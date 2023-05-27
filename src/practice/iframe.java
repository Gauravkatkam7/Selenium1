package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		
		driver.switchTo().frame("frame1");
		
		String text=driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println(text);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc=\"<p>Child Iframe</p>\"]")));
		
		
		String text1 = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println(text1);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//div[@class=\"header-text\"]")).click();
	
	}
}
