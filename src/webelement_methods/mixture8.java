package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture8 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login");

		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@tabindex='0'])[7]")).click();
		Thread.sleep(3000);
	WebElement w1=driver.findElement(By.xpath("//div[@tabindex='-1']"));
	String s1=w1.getText();
	System.out.println(s1);
	Thread.sleep(3000);
	boolean b1=w1.isEnabled();
	if(b1)
	{
		System.out.println("button is enabled");
	}
	else
	{
		System.out.println("button is disabled"); 
		
	}
	Thread.sleep(3000);
	driver.quit();
	
	
	
	}
}
