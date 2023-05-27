package dropbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getallselectedoptionfrommultiselectablelistbox5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		WebElement selected = driver.findElement(By.xpath("//select[@id=\"cars\"]"));
		Select s1=new Select(selected);
		s1.selectByIndex(3);
		s1.selectByIndex(2);
		s1.selectByIndex(0);
		
		Thread.sleep(3000);
		List<WebElement> all = s1.getAllSelectedOptions();
		int size=all.size();
		System.out.println(size);
		for(WebElement s2:all)
		{
			System.out.println(s2.getText());
		}
	
	
	
	}
}
