package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMainPageFromFrame1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(3000);
		
		driver.switchTo().frame("frame1");
		
		String text=driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
	
		System.out.println(text);
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//div[@class=\"header-text\"]")).click();
	}
}
