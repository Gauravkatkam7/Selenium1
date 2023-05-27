package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait1 {
	public static void main(String[] args) {
		
	
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("abc000");
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("xyz");
	

}
}