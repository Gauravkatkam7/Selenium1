package HandlingOfMultipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectMultipleCheckboxes2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"ic_circularclose_grey\"]")).click();
		
		List<WebElement> allelements = driver.findElements(By.xpath("//li[@class=\"font12 blackText wrapFilter  \"]"));
	
		for(WebElement s1:allelements)
		{
			s1.click();
			Thread.sleep(500);
		}
	
	
	
	}
}
