package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingofmultipleelements {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> we = driver.findElements(By.xpath("//a"));
		
//		for(WebElement s1:we)
//		{
//			System.out.println(s1.getText());
//		}
//		
		for(int i=0;i<=5;i++)
		{
			System.out.println(we.get(i).getText());
			
		}
//		System.out.println(we.get(2).getText());
		
		Iterator<WebElement> itr = we.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
		}
		
	}
}
