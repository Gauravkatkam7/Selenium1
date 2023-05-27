package assignment;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getoptionsasscending {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement w1=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select s1=new Select(w1);
		List<WebElement> all = s1.getOptions();
		
		TreeSet tr=new TreeSet();
		for(WebElement s2:all)
		{

			String data=s2.getText();

			tr.add(data);
			
		}
		System.out.println(tr);
		for(Object s3:tr)
		{
			System.out.println(s3);
		}

	}
}
