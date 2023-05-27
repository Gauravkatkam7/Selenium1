package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
boolean b1=	driver.findElement(By.xpath("//img[@class='_3r8MI']")).isDisplayed();
System.out.println(b1);
	}
}
