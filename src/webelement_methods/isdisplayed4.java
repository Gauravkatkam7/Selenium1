package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
	boolean b1=	driver.findElement(By.xpath("//i[@role='img']")).isDisplayed();
			System.out.println(b1);
			
			driver.quit();
	}
}
