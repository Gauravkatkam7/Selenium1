package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutselect {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		List<WebElement> w1 = driver.findElements(By.xpath("//select[@id=\"month\"]//option"));
//		
//		for(WebElement s1:w1)
//		{
//			System.out.println(s1.getText());
//		}
		for(int i=3;i<=7;i++)
		{
			System.out.println(w1.get(i).getText());
		}
	
	
	}
}
