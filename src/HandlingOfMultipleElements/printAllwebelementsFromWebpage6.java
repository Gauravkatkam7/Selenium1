package HandlingOfMultipleElements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printAllwebelementsFromWebpage6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select s1=new Select(month);
		List<WebElement> all = s1.getOptions();
		ArrayList<String>ar=new ArrayList<>();
//		for(WebElement s2:all)
//		{
//			ar.add(s2.getText());
//		}
//		Collections.sort(ar);
//		System.out.println(ar.get(2));
//		System.out.println(ar.get(7));
//		System.out.println(all.size());
//		Iterator<WebElement> itr = all.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next().getText());
//		}
		
		for(int i=0;i<=all.size()-1;i++)
		{
			String text = all.get(i).getText();
			System.out.println(text);
		}
	
		
	}
}
