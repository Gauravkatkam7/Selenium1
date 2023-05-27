package scrollupdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollview2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(2000);

		WebElement viewall = driver.findElement(By.xpath("(//a[text()='VIEW ALL'])[3]"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",viewall);
		Thread.sleep(2000);
		WebElement grocery = driver.findElement(By.xpath("//h2[text()='Grocery/Supermart']"));
	
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",grocery);
		
		Thread.sleep(2000);
		
		WebElement grocery1 = driver.findElement(By.xpath("//div[text()='Grocery']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",grocery1);
		
		Thread.sleep(2000);
	
	
	
	
	}
}
