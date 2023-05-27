package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame7 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		
		String text=driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
		System.out.println(text);
	
	}
}
