package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture12 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement w1=driver.findElement(By.xpath("//a[text()=' Cricbuzz Plus ']"));
		boolean b1=	w1.isEnabled();
		System.out.println(b1);
		Thread.sleep(3000);
		String s1=w1.getText();
		System.out.println(s1);
		Thread.sleep(2000);
	boolean b2=driver.findElement(By.xpath("//img[@title=\"Cricbuzz Logo\"]")).isDisplayed();
	System.out.println(b2);
	driver.findElement(By.xpath("//span[contains(@class,'search-input')]")).click();
	Thread.sleep(3000);
	WebElement w2=driver.findElement(By.xpath("//input[@name='search']"));
	w2.sendKeys("abc");
	Thread.sleep(2000);
String s3=w2.getAttribute("value");
System.out.println(s3);
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='SEARCH']")).click();
Thread.sleep(3000);
String s4=driver.findElement(By.xpath("//span[@class='cb-caret-down']")).getText();
System.out.println(s4);
Thread.sleep(3000);
driver.quit();

	
	
	
	
	
	
	
	
	
	
	
	}
}
