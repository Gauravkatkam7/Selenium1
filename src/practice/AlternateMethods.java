package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlternateMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//		WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]"));
//		
//		System.out.println("============sendkeys using javascript==================");
//		
//		((JavascriptExecutor)driver).executeScript("arguments[0].value='gaurav';",email);
//		Thread.sleep(2000);
//		
//		System.out.println("============clear using javascript==================");
//		
//		((JavascriptExecutor)driver).executeScript("arguments[0].value=''",email);
		
		System.out.println("============click using javascript==================");
		
		WebElement button = driver.findElement(By.xpath("//button[@name=\"login\"]"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].click()",button);
		button.submit(); // submit method is used to click
	}
}
