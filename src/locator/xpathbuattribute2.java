package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbuattribute2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("what is web element in selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	}
}
