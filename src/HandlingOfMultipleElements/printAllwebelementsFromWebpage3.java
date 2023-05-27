package HandlingOfMultipleElements;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printAllwebelementsFromWebpage3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> allelements = driver.findElements(By.xpath("//a"));
		System.out.println(allelements.size());
		
		for(WebElement s1:allelements)
		{
			System.out.println(s1.getText());
		}
	
	}
}
