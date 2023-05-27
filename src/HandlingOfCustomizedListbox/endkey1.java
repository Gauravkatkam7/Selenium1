package HandlingOfCustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class endkey1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id=\"month\"]")).click();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		for(int i=0;i<=1;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();;
			Thread.sleep(2000);
		}
		
	}
}
