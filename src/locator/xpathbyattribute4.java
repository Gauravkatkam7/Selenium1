package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattribute4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mobikwik.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("7020790545");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Amount']")).sendKeys("666");
		Thread.sleep(5000);
		driver.findElement(By.xpath("")).click();
	}
}
