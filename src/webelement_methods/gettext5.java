package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String s1=driver.findElement(By.xpath("//input[@name='username']")).getText();
		Thread.sleep(3000);
		System.out.println(s1);
	}
}
