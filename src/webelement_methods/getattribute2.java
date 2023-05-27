package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement e2=driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d']"));
		e2.sendKeys("katkam");
		Thread.sleep(3000);
		String s2=e2.getAttribute("value");
		System.out.println(s2);
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d'])[2]"));
		e1.sendKeys("gaurav");
		Thread.sleep(3000);
		String s1=e1.getAttribute("value");
		System.out.println(s1);
		
		
		
	 
	
	}
}
