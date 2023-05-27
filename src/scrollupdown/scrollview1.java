package scrollupdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollview1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement help = driver.findElement(By.xpath("//a[@href=\"/help/?ref=pf\"]"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",help);
		
		WebElement text = driver.findElement(By.xpath("//input[@aria-label=\"Email address or phone number\"]"));
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",text);
		
	
	
	
	}
}
