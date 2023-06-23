package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearWithoutUsingClearMethod {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement element = driver.findElement(By.xpath("//input[@id=\"email\"]"));
	element.sendKeys("abc");
	Thread.sleep(2000);
	element.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);

}
}