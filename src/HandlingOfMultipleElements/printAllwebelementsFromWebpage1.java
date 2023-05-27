package HandlingOfMultipleElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printAllwebelementsFromWebpage1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
//		for(WebElement s1:alllinks)
//		{
//			System.out.println(s1.getText());
//		}
//		for(int i=0;i<=5;i++)
//		{
//			String text = alllinks.get(i).getText();
//			System.out.println(text);
//		}
		Iterator<WebElement> itr = alllinks.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
		}
	}
}
