package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		boolean b1=driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
			System.out.println(b1);
			Thread.sleep(3000);
			String s1=driver.findElement(By.xpath("//select[@name='url']")).getText();
			System.out.println(s1);
			
		String s2=driver.findElement(By.xpath("//div[text()='EN']")).getText();
		System.out.println(s2);
	}
}
