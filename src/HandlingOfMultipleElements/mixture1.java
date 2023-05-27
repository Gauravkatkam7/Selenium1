package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mixture1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		String s2[]= {"Jan","Feb","Mar","april"};
		List<WebElement> w1 = driver.findElements(By.xpath("//select[@id=\"month\"]"));
		for(WebElement s1:w1)
		{
			String text=s1.getText();
			
			for(int i=0;i<=s2.length-1;i++)
			{
				if(text.contains(s2[i]))
				{
					System.out.println(s2[i]);
				}
				else
				{
					System.out.println("element is not present");
				}
			}
		}
	
	
	}
}
