package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindow4 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name=\"NewTab\"]")).click();
		
		  Set<String> allwindowid = driver.getWindowHandles();
		ArrayList<String>ar=new ArrayList<>(allwindowid);
		//String childwindowid=ar.get(1);
		
		driver.switchTo().window(ar.get(1));
		
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		
		
	}
}
