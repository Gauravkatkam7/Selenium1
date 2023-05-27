package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(3000);
		
		driver.switchTo().frame("frame1");
		
		String text=driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println(text);
		
	}
}
