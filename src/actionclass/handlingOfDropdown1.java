package actionclass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingOfDropdown1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		WebElement w1 = driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(w1).perform();
		
		driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
		
		
	}
}
