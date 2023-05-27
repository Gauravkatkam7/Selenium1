package dropbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllOptionsFromListbox2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement w1=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select s1=new Select(w1);
		List<WebElement>all=s1.getOptions();
		int size=all.size();
		System.out.println(size);
		
		for(WebElement w2:all)
		{
			System.out.println(w2.getText());
		}
	
	
	
	
	}
}
