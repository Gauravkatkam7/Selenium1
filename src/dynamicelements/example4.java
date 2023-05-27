package dynamicelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/");
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("((//div[@class=\"counter-group\"])[22]//span)[1]")).getText();
		System.out.println(text);
	
	}
}
