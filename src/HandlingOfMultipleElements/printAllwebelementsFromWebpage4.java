package HandlingOfMultipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printAllwebelementsFromWebpage4 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> allelements = driver.findElements(By.xpath("//input"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		allelements.get(2).sendKeys("gaurav");
		allelements.get(3).sendKeys("katakm");
		
	
	}
}
