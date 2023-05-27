package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectMultipleCheckboxes3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"ic_circularclose_grey\"]")).click();

		List<WebElement> allradio = driver.findElements(By.xpath("//span[@class=\"tabsCircle appendRight5\"]"));
		
		for(WebElement s1:allradio)
		{
			s1.click();
			Thread.sleep(500);
		}
	}
}
