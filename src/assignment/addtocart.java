package assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addtocart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("boat watch");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]")).click();

		
		Set<String> windowid = driver.getWindowHandles();
		ArrayList<String>ar=new ArrayList<String>(windowid);
		
		driver.switchTo().window(ar.get(1));
		
	
		
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
	}
}
