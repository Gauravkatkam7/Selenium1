package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture11 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
	driver.findElement(By.xpath("//img[@alt='OnePlus Nord CE 3 Lite 5G | ₹19,999' and @alt='Samsung M14 5G | ₹14,990']")).click();
	     
	}
}
