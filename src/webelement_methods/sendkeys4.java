package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys4 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		
		WebElement text=driver.findElement(By.xpath("//input[@type='tel']"));
		     text.sendKeys("3242442442");
	}
}
