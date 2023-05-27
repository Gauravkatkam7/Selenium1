package assignment;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getoptionsasscending1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement w1=driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
		Select s1=new Select(w1);
		List<WebElement> all = s1.getOptions();
		
		TreeSet tr=new TreeSet();
		
		for(WebElement s2:all)
		{
			String data=s2.getText();
			tr.add(data);
			
		}
	
		System.out.println(tr.size());
		System.out.println(tr);
		
		for(Object l1:tr)
		{
			System.out.println(l1);
		}
	
	
	
	}
}
