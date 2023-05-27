package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mobikwik.com/");
		WebElement mob=driver.findElement(By.xpath("//input[@role='combobox']"));
		Thread.sleep(3000);
		mob.sendKeys("7020790545");
	}
}
