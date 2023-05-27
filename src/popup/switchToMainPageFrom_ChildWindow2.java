package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToMainPageFrom_ChildWindow2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name=\"NewTab\"]")).click();
		Set<String> allwindowid = driver.getWindowHandles();
		ArrayList<String>ar=new ArrayList<>(allwindowid);
		
		driver.switchTo().window(ar.get(1));
		
		
		
//		driver.findElement(By.xpath("//span[text()='Training']")).click();
//		
		driver.switchTo().window(ar.get(0));
		Thread.sleep(3000);
//		
		driver.findElement(By.xpath("//input[@name=\"NewWindow\"]")).click();
		Thread.sleep(3000);
		Set<String> currentwindow = driver.getWindowHandles();
		ArrayList<String>ar1=new ArrayList<>(currentwindow);
		driver.switchTo().window(ar1.get(2));
//		
		driver.findElement(By.xpath("//div[@class=\"mobile-navigation\"]")).click();
	}
}
