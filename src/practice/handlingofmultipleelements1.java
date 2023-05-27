package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingofmultipleelements1 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		List<WebElement> all = driver.findElements(By.xpath("//select[@id=\"month\"]/option"));
		

//		String text=all.get(6).getText();
//		System.out.println(text);

		for(int i=0;i<=5;i++)
		{
			System.out.println(all.get(i).getText());
		}
		
		
	}
}
