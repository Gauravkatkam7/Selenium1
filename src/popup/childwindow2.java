package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindow2 {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name=\"NewWindow\"]")).click();
		driver.findElement(By.xpath("(//input[@class=\"btn\"])[2]")).click();
	
		
		Set<String> windowid = driver.getWindowHandles();
		ArrayList<String> ar=new ArrayList<String>(windowid);
		
		driver.switchTo().window(ar.get(1));
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		driver.switchTo().window(ar.get(2));
		driver.findElement(By.xpath("//div[@class=\"mobile-navigation\"]")).click();
	}

}
