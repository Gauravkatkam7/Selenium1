package dynamicelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/");
		
		String text = driver.findElement(By.xpath("//div[@id=\"c29\"]//span")).getText();
	    System.out.println(text);
	
	
	}
}
