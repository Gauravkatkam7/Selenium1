package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement w1 = driver.findElement(By.xpath("//input[@value=\"New Tab\"]"));
		w1.click();
//		
//	           Set<String>allid= driver.getWindowHandles();
//	           ArrayList<String>ar=new ArrayList<>(allid);
//	           driver.switchTo().window(ar.get(1));
//	           
//	           driver.findElement(By.xpath("//span[text()='Training']")).click();
//	           
//	           driver.close();
//	           driver.switchTo().window(ar.get(0));
//	           
//	           driver.findElement(By.xpath("//input[@name=\"NewWindow\"]")).click();
		w1.click();
		w1.click();
		
		Set<String> allids=driver.getWindowHandles();
		ArrayList<String> ar=new ArrayList<>(allids);
		driver.switchTo().window(ar.get(1));
		
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		
		driver.switchTo().window(ar.get(2));
		
		driver.switchTo().window(ar.get(3));
		driver.switchTo().window(ar.get(0));
		driver.findElement(By.xpath("//input[@name=\"NewWindow\"]")).click();
		
		
		Set<String> currentid = driver.getWindowHandles();
		ArrayList<String> ar1=new ArrayList<>(currentid);
		driver.switchTo().window(ar1.get(4));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"mobile-navigation\"]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
