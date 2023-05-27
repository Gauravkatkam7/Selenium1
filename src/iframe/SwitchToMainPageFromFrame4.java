package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMainPageFromFrame4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(3000);
		driver.switchTo().frame("frame1");
		
		String text=driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println(text);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc=\"<p>Child Iframe</p>\"]")));
		
		String text1=driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println(text1);
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		String text3=driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println(text3);
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//div[@class=\"header-text\"]")).click();
	
	}
}
