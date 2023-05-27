package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
						
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
				Thread.sleep(2000);
		 WebElement terms=driver.findElement(By.xpath("//a[text()='Payments']"));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",terms);	
		 
		 Thread.sleep(2000);
		 WebElement terms1=driver.findElement(By.xpath("(//div[@class=\"eFQ30H\"])[3]"));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",terms1);	
	}

}
