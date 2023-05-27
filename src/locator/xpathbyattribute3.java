package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattribute3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='_2EGQY cqA0P']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("7020790545");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jio");
		
		
	}
}


