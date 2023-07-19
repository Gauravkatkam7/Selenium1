package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait 
{
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		WebDriverWait webdriver=new WebDriverWait(driver, Duration.ofSeconds(5));
	
		driver.findElement(By.xpath("//button[text()='Display button after 10 seconds']")).click();
	
	
		driver.findElement(By.xpath("//button[text()='Check Checkbox after 10 seconds']")).click();
	
	
	
	
	
	
	
	
	
	}

}
