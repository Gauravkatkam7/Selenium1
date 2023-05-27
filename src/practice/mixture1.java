package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement w1=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		w1.sendKeys("gaurav");
		String text=w1.getAttribute("value");
		System.out.println(text);
		w1.clear();
	  boolean en = driver.findElement(By.xpath("//button[@name=\"login\"]")).isEnabled();
		if(en)
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is disabled");
		}
		Thread.sleep(2000);
	WebElement w2=driver.findElement(By.xpath("//a[text()='Create new account']"));
	String text1=w2.getText();
	System.out.println(text1);
	w2.click();
		Thread.sleep(2000);
		WebElement w3 = driver.findElement(By.xpath("//label[text()='Female']"));
		w3.click();
		Thread.sleep(2000);
		boolean se=w3.isSelected();
		if(se)
		{
			System.out.println("button is selected");
		}
		else
		{
			System.out.println("button is not selected");
		}
		
		driver.findElement(By.xpath(""))
	
		
		

		
		
		
		
	}
}
