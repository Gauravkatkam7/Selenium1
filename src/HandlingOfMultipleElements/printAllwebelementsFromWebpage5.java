package HandlingOfMultipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printAllwebelementsFromWebpage5 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> allelements = driver.findElements(By.xpath("//a"));
		System.out.println(allelements.size());
//		for(WebElement s1:allelements)
//		{
//			System.out.println(s1.getText());
//		}
		for(int i=0;i<=5;i++)
		{
		
			allelements.get(i).getText();
		}
		
		
	}
}
