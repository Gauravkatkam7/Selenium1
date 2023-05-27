package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
WebElement w1=driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d']"));
	w1.sendKeys("gaurav");
	Thread.sleep(2000);
	String text=w1.getAttribute("value");
	System.out.println(text);
	}
}
