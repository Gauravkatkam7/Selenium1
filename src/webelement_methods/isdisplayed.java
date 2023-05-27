package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	boolean b1=	driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		System.out.println(b1);
		if(b1) {
			System.out.println("image is displayed ");
		}
		else
		{
			System.out.println("image is undisplayed ");
		}
	}
}
