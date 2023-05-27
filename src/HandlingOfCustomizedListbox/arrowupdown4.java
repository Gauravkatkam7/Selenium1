package HandlingOfCustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class arrowupdown4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\" css-1hwfws3\"]")).click();
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();;
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).perform();;
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
	}
}
