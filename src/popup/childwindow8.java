package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindow8 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		
		WebElement w1 = driver.findElement(By.xpath("//input[@name=\"NewTab\"]"));
		
		w1.click();
		w1.click();
		Thread.sleep(2000);
		Set<String> windowid = driver.getWindowHandles();
		ArrayList<String>ar=new ArrayList<>(windowid);
		
		driver.switchTo().window(ar.get(2));
		
		
	
	
	}
}
