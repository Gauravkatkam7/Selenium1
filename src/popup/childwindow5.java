package popup;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindow5 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@id=\"tabButton\"]")).click();
		
		Set<String> allwindowid = driver.getWindowHandles();
		ArrayList<String>ar=new ArrayList<>(allwindowid);
		
		driver.switchTo().window(ar.get(1));
		String text=driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
		System.out.println(text);
	
	}
}
