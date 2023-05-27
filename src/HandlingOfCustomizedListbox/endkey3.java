package HandlingOfCustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class endkey3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement w1 = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		act.click(w1).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.END).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		
		for(int i=0;i<=7;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();;
			Thread.sleep(500);
		}
		act.sendKeys(Keys.ENTER).perform();
		
	}
}
