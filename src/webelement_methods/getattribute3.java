package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement w1=driver.findElement(By.xpath("//input[@name='username']"));
		w1.sendKeys("gaurav");
		Thread.sleep(2000);
		String s1=w1.getAttribute("value");
		System.out.println(s1);
		Thread.sleep(3000);
WebElement w2=driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d'])[2]"));
	w2.sendKeys("katkam");
	Thread.sleep(4000);
	String s2=w2.getAttribute("value");
	System.out.println(s2);
	}
}
