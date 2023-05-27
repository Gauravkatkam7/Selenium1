package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathbyattribute5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
	
		driver.get("https://www.mobikwik.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("7020790545");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='amt']")).sendKeys("666");
		Thread.sleep(5000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(3000);
	}
}
