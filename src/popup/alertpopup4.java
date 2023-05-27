package popup;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
		driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();
		
		Alert alert=driver.switchTo().alert();
		
		String text=alert.getText();
		System.out.println(text);
		Thread.sleep(3000);
		alert.dismiss();
	
	
	
	}
}
