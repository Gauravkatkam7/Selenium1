package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture5 {
public static void main(String[] args) throws InterruptedException {
	

	WebDriver driver=new ChromeDriver();
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.get("https://www.mobikwik.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("7020790545");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='Amount']")).sendKeys("666");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
}
}