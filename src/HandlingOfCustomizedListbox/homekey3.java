package HandlingOfCustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class homekey3 {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id=\"oldSelectMenu\"]")).click();
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.HOME).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
	}
}
