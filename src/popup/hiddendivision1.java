package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendivision1 {

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]")).sendKeys("xyz");
		
	}
}
