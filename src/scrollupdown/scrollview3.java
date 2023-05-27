package scrollupdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollview3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		WebElement deals = driver.findElement(By.xpath("//a[text()='See all deals']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",deals);
		
//		Thread.sleep(2000);
//		WebElement essentials = driver.findElement(By.xpath("//a[text()='Enjoy all the benefits of Prime']"));
//		
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",essentials);
		Thread.sleep(4000);
		
		WebElement affiliates = driver.findElement(By.xpath("//span[text()='© 1996-2023, Amazon.com, Inc. or its affiliates']"));
	
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",affiliates);
		
		Thread.sleep(2000);
		WebElement Prime = driver.findElement(By.xpath("//h2[text()='Appliances for your home | Up to 55% off']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Prime);
		
	
	
	}
}
