package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindow7 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
	 WebElement w1 = driver.findElement(By.xpath("//button[@id=\"tabButton\"]"));
	 w1.click();
	 Thread.sleep(500);
	 w1.click();
	 Thread.sleep(500);
	 w1.click();
		Thread.sleep(3000);
		Set<String> windowid = driver.getWindowHandles();
		
		ArrayList<String>ar=new ArrayList<>(windowid);
		
		driver.switchTo().window(ar.get(1));
		String text = driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
		
		System.out.println(text);
	}
}
